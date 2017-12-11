package com.kf.admin.controller;

import com.kf.admin.pojo.Advert;
import com.kf.admin.pojo.Banner;
import com.kf.admin.pojo.BasePath;
import com.kf.admin.service.AdvertService;
import com.kf.admin.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.text.resources.iw.FormatData_iw;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author zhy
 * @create 2017-11-08 19:45
 **/
@RestController
public class AdvertController {

    @Autowired
    AdvertService advertService;
    @Autowired
    private ResourceLoader resourceLoader;
    @Autowired
    private BannerService bannerService;
    @GetMapping("/ADManage")
    public ModelAndView adManager(String page){
        ModelAndView modelAndView = new ModelAndView("AdManage");
        modelAndView.addObject("adverts",advertService.getAdvertsByPage(page));
        modelAndView.addObject("page",page);
        return modelAndView;
    }

    /**
     * 获取所有advert
     * @return  List<Advert>
     */
    @GetMapping("/getAdvertList")
    public List<Advert> getAdvertList(){
        return advertService.getAdvertList();
    }

    /**
     * 根据page对所有的avert分组
     * @return List<String>
     */
    @GetMapping("/getAdvertPageList")
    public List<String> getAdvertPageList(){
        return advertService.getAdvertPageList();
    }

    /**
     * 根据page获取对应的avert
     * @param page
     * @return List<Advert>
     */
    @GetMapping("/getAdvertsByPage")
    public List<Advert> getAdvertsByPage(String page){
        return advertService.getAdvertsByPage(page);
    }

    /**
     * 查找出该page下被选中positon的advert
     * @param page
     * @param position
     * @return Advert
     */
    @GetMapping("/getAdvertByPositionAndPage")
    public Advert getAdvertByPositionAndPage(String page,String position){
        return advertService.getAdvertByPositionAndPage(page,position);
    }
    @PostMapping("/adUpload")
    public ModelAndView adUpload(@RequestParam("image") MultipartFile pic, String imgUrl, String page,@RequestParam(required = false)String bannerTitle,@RequestParam(required = false)int advertId,@RequestParam(required = false)String bannerContent) throws IOException {
        if(null != pic &&!pic.isEmpty()){
            String realPath = BasePath.getBasePath()+imgUrl;
            File file = new File(realPath);
            if(file.exists()){
                file.delete();
                pic.transferTo(file);
            }
        }
        //封装banner
        Banner banner = new Banner(advertId,bannerTitle,bannerContent);
        bannerService.alterBanner(banner);
        //跳转到adManager(）函数
        return adManager(page);
    }
    @GetMapping("/img/{classPath}/{filename:.+}")
    @ResponseBody
    public ResponseEntity<?> getFile(@PathVariable String classPath , @PathVariable String filename) {
        try {
            System.out.println(filename);
            return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(BasePath.getBasePath() + "/img/"+classPath, filename).toString()));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
