package com.ywj.bannertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = (Banner) findViewById(R.id.banner);
        List<String > image = new ArrayList<>();
        image.clear();
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492059840637&di=dda7a22772760d7c545b9e3eee39df25&imgtype=0&src=http%3A%2F%2Fwww.sznews.com%2Fphoto%2Fimages%2Fattachement%2Fjpg%2Fsite3%2F20150923%2F4439c452e8ec176c977e1d.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492059840636&di=36b0307eb863de131d0cd6ca762ece7f&imgtype=0&src=http%3A%2F%2Fc11.eoemarket.com%2Fapp0%2F275%2F275112%2Fscreen%2F1525959.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492059840636&di=cb13964b0dcad556f2793b4b71f62e50&imgtype=0&src=http%3A%2F%2Fliaoning.sinaimg.cn%2F2013%2F1101%2FU8828P1195DT20131101091142.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492059840662&di=1fdbb0f8f26436468506b90ca0ff739e&imgtype=0&src=http%3A%2F%2Fwww.jder.net%2Fwp-content%2Fuploads%2F2015%2F10%2F20151004135040-23.jpg");
        image.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492059840662&di=cf6b64ba6bb82c5655f6a1aab382e44d&imgtype=0&src=http%3A%2F%2Fimg002.21cnimg.com%2Fphotos%2Fgame_0%2F20140419%2Fc100-0-0-600-504_r0%2FB7EA3FF6CE7EC43B3976BA23ABF4D893.jpeg");

        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        banner.setBannerTitles(image);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(image);
        //设置banner动画效果
//        banner.setBannerAnimation(Transformer.DepthPage);
//        //设置标题集合（当banner样式有显示title时）
//        banner.setBannerTitles(titles);
//        //设置自动轮播，默认为true
//        banner.isAutoPlay(true);
        //设置轮播时间
//        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
//        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
