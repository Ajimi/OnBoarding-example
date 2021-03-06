package onboarding.selim.com.onboarding;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance(getString(R.string.explore_products), getString(R.string.explore_products_description), R.drawable.ic_explore_poduct, Color.parseColor("#ffffff"), Color.parseColor("#000001"), Color.parseColor("#000001")));
        addSlide(AppIntroFragment.newInstance(getString(R.string.make_payments), getString(R.string.make_payments_description), R.drawable.ic_spend_money, Color.parseColor("#ffffff"), Color.parseColor("#000001"), Color.parseColor("#000001")));
        addSlide(AppIntroFragment.newInstance(getString(R.string.enjoy_shopping), getString(R.string.enjoy_shopping_description), R.drawable.ic_enjoy_shopping, Color.parseColor("#ffffff"), Color.parseColor("#000001"), Color.parseColor("#000001")));

        setProgressButtonEnabled(true);
        
        setColorDoneText(Color.parseColor("#000000"));
        setColorSkipButton(Color.parseColor("#000000"));
        setIndicatorColor(Color.parseColor("#22222222"), Color.parseColor("#ffAf8f"));
        setNextArrowColor(Color.parseColor("#000000"));
        showSkipButton(true);
        setFadeAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
