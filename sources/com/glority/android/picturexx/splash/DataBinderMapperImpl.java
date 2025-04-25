package com.glority.android.picturexx.splash;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.databinding.ActivityDeeplinkHandlerBindingImpl;
import com.glority.android.picturexx.splash.databinding.ActivityMainBindingImpl;
import com.glority.android.picturexx.splash.databinding.ActivitySplashBindingImpl;
import com.glority.android.picturexx.splash.databinding.ActivitySplashOnboardingBindingImpl;
import com.glority.android.picturexx.splash.databinding.ActivitySplashRestoreBindingImpl;
import com.glority.android.picturexx.splash.databinding.DialogEmptyComposeViewLayoutBindingImpl;
import com.glority.android.picturexx.splash.databinding.DialogForceUpdateBindingImpl;
import com.glority.android.picturexx.splash.databinding.FragmentSplashAgreementBindingImpl;
import com.glority.android.picturexx.splash.databinding.FragmentSplashBindingImpl;
import com.glority.android.picturexx.splash.databinding.FragmentSplashGuideOnBoardingBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYDEEPLINKHANDLER = 1;
    private static final int LAYOUT_ACTIVITYMAIN = 2;
    private static final int LAYOUT_ACTIVITYSPLASH = 3;
    private static final int LAYOUT_ACTIVITYSPLASHONBOARDING = 4;
    private static final int LAYOUT_ACTIVITYSPLASHRESTORE = 5;
    private static final int LAYOUT_DIALOGEMPTYCOMPOSEVIEWLAYOUT = 6;
    private static final int LAYOUT_DIALOGFORCEUPDATE = 7;
    private static final int LAYOUT_FRAGMENTSPLASH = 8;
    private static final int LAYOUT_FRAGMENTSPLASHAGREEMENT = 9;
    private static final int LAYOUT_FRAGMENTSPLASHGUIDEONBOARDING = 10;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_deeplink_handler, 1);
        sparseIntArray.put(R.layout.activity_main, 2);
        sparseIntArray.put(R.layout.activity_splash, 3);
        sparseIntArray.put(R.layout.activity_splash_onboarding, 4);
        sparseIntArray.put(R.layout.activity_splash_restore, 5);
        sparseIntArray.put(R.layout.dialog_empty_compose_view_layout, 6);
        sparseIntArray.put(R.layout.dialog_force_update, 7);
        sparseIntArray.put(R.layout.fragment_splash, 8);
        sparseIntArray.put(R.layout.fragment_splash_agreement, 9);
        sparseIntArray.put(R.layout.fragment_splash_guide_on_boarding, 10);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_deeplink_handler_0".equals(tag)) {
                    return new ActivityDeeplinkHandlerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_deeplink_handler is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_main_0".equals(tag)) {
                    return new ActivityMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_splash_0".equals(tag)) {
                    return new ActivitySplashBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_splash_onboarding_0".equals(tag)) {
                    return new ActivitySplashOnboardingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_splash_onboarding is invalid. Received: " + tag);
            case 5:
                if ("layout/activity_splash_restore_0".equals(tag)) {
                    return new ActivitySplashRestoreBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_splash_restore is invalid. Received: " + tag);
            case 6:
                if ("layout/dialog_empty_compose_view_layout_0".equals(tag)) {
                    return new DialogEmptyComposeViewLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_empty_compose_view_layout is invalid. Received: " + tag);
            case 7:
                if ("layout/dialog_force_update_0".equals(tag)) {
                    return new DialogForceUpdateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_force_update is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_splash_0".equals(tag)) {
                    return new FragmentSplashBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_splash_agreement_0".equals(tag)) {
                    return new FragmentSplashAgreementBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_splash_agreement is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_splash_guide_on_boarding_0".equals(tag)) {
                    return new FragmentSplashGuideOnBoardingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_splash_guide_on_boarding is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.payment.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.recognize.DataBinderMapperImpl());
        arrayList.add(new com.glority.base.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes5.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(7);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "percentage");
            sparseArray.put(2, "price_per_week");
            sparseArray.put(3, "selected_index");
            sparseArray.put(4, "trialDays");
            sparseArray.put(5, "weekly_price");
            sparseArray.put(6, "yearly_price");
        }
    }

    /* loaded from: classes5.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(10);
            sKeys = hashMap;
            hashMap.put("layout/activity_deeplink_handler_0", Integer.valueOf(R.layout.activity_deeplink_handler));
            hashMap.put("layout/activity_main_0", Integer.valueOf(R.layout.activity_main));
            hashMap.put("layout/activity_splash_0", Integer.valueOf(R.layout.activity_splash));
            hashMap.put("layout/activity_splash_onboarding_0", Integer.valueOf(R.layout.activity_splash_onboarding));
            hashMap.put("layout/activity_splash_restore_0", Integer.valueOf(R.layout.activity_splash_restore));
            hashMap.put("layout/dialog_empty_compose_view_layout_0", Integer.valueOf(R.layout.dialog_empty_compose_view_layout));
            hashMap.put("layout/dialog_force_update_0", Integer.valueOf(R.layout.dialog_force_update));
            hashMap.put("layout/fragment_splash_0", Integer.valueOf(R.layout.fragment_splash));
            hashMap.put("layout/fragment_splash_agreement_0", Integer.valueOf(R.layout.fragment_splash_agreement));
            hashMap.put("layout/fragment_splash_guide_on_boarding_0", Integer.valueOf(R.layout.fragment_splash_guide_on_boarding));
        }
    }
}
