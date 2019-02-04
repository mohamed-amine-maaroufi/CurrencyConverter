package com.andromob.currencyconverter;

import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;
import es.dmoral.prefs.Prefs;


public class Activity_Introactivity extends MaterialIntroActivity
{

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        enableLastSlideAlphaExitTransition(true);

        getNextButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.white)
                        .buttonsColor(R.color.bleu)
                        .image(R.drawable.intro_first_screeen)
                        .title("Simple and Clean UI")
                        .description("In Market Rates you can check live currency rates")
                        .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.white)
                .buttonsColor(R.color.bleu)
                .image(R.drawable.intro_usd_source)
                .title("Source of conversion")
                .description("rates of all currency is US Dollar")
                .build());


        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.white)
                        .buttonsColor(R.color.bleu)
                         .image(R.drawable.intro_second_screen)
                        .title("Convert currency rate")
                        .description("You can convert any currency rate with on click")
                        .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.white)
                .buttonsColor(R.color.bleu)
                .image(R.drawable.intro_tick_mark)
                .title("That's it")
                .description("Enjoy Free Currency Converter")
                .build());

    }


    @Override
    public void onFinish() {
        super.onFinish();
        Prefs.with(Activity_Introactivity.this).writeInt("intro_key", 01);
       // Toast.makeText(this, "Try this library in your project! :)", Toast.LENGTH_SHORT).show();
    }
}
