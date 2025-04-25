package com.glority.android.picturexx.settings;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.databinding.ActivityAccountBindingImpl;
import com.glority.android.picturexx.settings.databinding.DialogSelectLanguageBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentAboutBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentAccountBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentDeleteAccountBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentFaqAndHelpBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentFeedbackBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentLoginBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentPremuimServiceBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentProfileBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentResetPasswordBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentSettingBindingImpl;
import com.glority.android.picturexx.settings.databinding.FragmentSignUpBindingImpl;
import com.glority.android.picturexx.settings.databinding.ItemPremiumServerBindingImpl;
import com.glority.android.picturexx.settings.databinding.ItemUnvipcardBindingImpl;
import com.glority.android.picturexx.settings.databinding.ItemVipcardBindingImpl;
import com.glority.android.picturexx.settings.databinding.LayoutCheckEmailBindingImpl;
import com.glority.android.picturexx.settings.databinding.LayoutConfirmPasswordBindingImpl;
import com.glority.android.picturexx.settings.databinding.LayoutResetPasswordBindingImpl;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBindingImpl;
import com.glority.android.picturexx.settings.databinding.LayoutSettingVipPortraitBindingImpl;
import com.glority.android.picturexx.settings.databinding.ListItemVipSupportAddImageBindingImpl;
import com.glority.android.picturexx.settings.databinding.ListItemVipSupportImageBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYACCOUNT = 1;
    private static final int LAYOUT_DIALOGSELECTLANGUAGE = 2;
    private static final int LAYOUT_FRAGMENTABOUT = 3;
    private static final int LAYOUT_FRAGMENTACCOUNT = 4;
    private static final int LAYOUT_FRAGMENTDELETEACCOUNT = 5;
    private static final int LAYOUT_FRAGMENTFAQANDHELP = 6;
    private static final int LAYOUT_FRAGMENTFEEDBACK = 7;
    private static final int LAYOUT_FRAGMENTLOGIN = 8;
    private static final int LAYOUT_FRAGMENTPREMUIMSERVICE = 9;
    private static final int LAYOUT_FRAGMENTPROFILE = 10;
    private static final int LAYOUT_FRAGMENTRESETPASSWORD = 11;
    private static final int LAYOUT_FRAGMENTSETTING = 12;
    private static final int LAYOUT_FRAGMENTSIGNUP = 13;
    private static final int LAYOUT_ITEMPREMIUMSERVER = 14;
    private static final int LAYOUT_ITEMUNVIPCARD = 15;
    private static final int LAYOUT_ITEMVIPCARD = 16;
    private static final int LAYOUT_LAYOUTCHECKEMAIL = 17;
    private static final int LAYOUT_LAYOUTCONFIRMPASSWORD = 18;
    private static final int LAYOUT_LAYOUTRESETPASSWORD = 19;
    private static final int LAYOUT_LAYOUTSETTINGTOOLBAR = 20;
    private static final int LAYOUT_LAYOUTSETTINGVIPPORTRAIT = 21;
    private static final int LAYOUT_LISTITEMVIPSUPPORTADDIMAGE = 22;
    private static final int LAYOUT_LISTITEMVIPSUPPORTIMAGE = 23;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(23);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_account, 1);
        sparseIntArray.put(R.layout.dialog_select_language, 2);
        sparseIntArray.put(R.layout.fragment_about, 3);
        sparseIntArray.put(R.layout.fragment_account, 4);
        sparseIntArray.put(R.layout.fragment_delete_account, 5);
        sparseIntArray.put(R.layout.fragment_faq_and_help, 6);
        sparseIntArray.put(R.layout.fragment_feedback, 7);
        sparseIntArray.put(R.layout.fragment_login, 8);
        sparseIntArray.put(R.layout.fragment_premuim_service, 9);
        sparseIntArray.put(R.layout.fragment_profile, 10);
        sparseIntArray.put(R.layout.fragment_reset_password, 11);
        sparseIntArray.put(R.layout.fragment_setting, 12);
        sparseIntArray.put(R.layout.fragment_sign_up, 13);
        sparseIntArray.put(R.layout.item_premium_server, 14);
        sparseIntArray.put(R.layout.item_unvipcard, 15);
        sparseIntArray.put(R.layout.item_vipcard, 16);
        sparseIntArray.put(R.layout.layout_check_email, 17);
        sparseIntArray.put(R.layout.layout_confirm_password, 18);
        sparseIntArray.put(R.layout.layout_reset_password, 19);
        sparseIntArray.put(R.layout.layout_setting_toolbar, 20);
        sparseIntArray.put(R.layout.layout_setting_vip_portrait, 21);
        sparseIntArray.put(R.layout.list_item_vip_support_add_image, 22);
        sparseIntArray.put(R.layout.list_item_vip_support_image, 23);
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
                if ("layout/activity_account_0".equals(tag)) {
                    return new ActivityAccountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_account is invalid. Received: " + tag);
            case 2:
                if ("layout/dialog_select_language_0".equals(tag)) {
                    return new DialogSelectLanguageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_select_language is invalid. Received: " + tag);
            case 3:
                if ("layout/fragment_about_0".equals(tag)) {
                    return new FragmentAboutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_account_0".equals(tag)) {
                    return new FragmentAccountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_delete_account_0".equals(tag)) {
                    return new FragmentDeleteAccountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_delete_account is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_faq_and_help_0".equals(tag)) {
                    return new FragmentFaqAndHelpBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_faq_and_help is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_feedback_0".equals(tag)) {
                    return new FragmentFeedbackBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_feedback is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_login_0".equals(tag)) {
                    return new FragmentLoginBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_premuim_service_0".equals(tag)) {
                    return new FragmentPremuimServiceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_premuim_service is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_profile_0".equals(tag)) {
                    return new FragmentProfileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_reset_password_0".equals(tag)) {
                    return new FragmentResetPasswordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_reset_password is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_setting_0".equals(tag)) {
                    return new FragmentSettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_sign_up_0".equals(tag)) {
                    return new FragmentSignUpBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
            case 14:
                if ("layout/item_premium_server_0".equals(tag)) {
                    return new ItemPremiumServerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_premium_server is invalid. Received: " + tag);
            case 15:
                if ("layout/item_unvipcard_0".equals(tag)) {
                    return new ItemUnvipcardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_unvipcard is invalid. Received: " + tag);
            case 16:
                if ("layout/item_vipcard_0".equals(tag)) {
                    return new ItemVipcardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_vipcard is invalid. Received: " + tag);
            case 17:
                if ("layout/layout_check_email_0".equals(tag)) {
                    return new LayoutCheckEmailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_check_email is invalid. Received: " + tag);
            case 18:
                if ("layout/layout_confirm_password_0".equals(tag)) {
                    return new LayoutConfirmPasswordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_confirm_password is invalid. Received: " + tag);
            case 19:
                if ("layout/layout_reset_password_0".equals(tag)) {
                    return new LayoutResetPasswordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_reset_password is invalid. Received: " + tag);
            case 20:
                if ("layout/layout_setting_toolbar_0".equals(tag)) {
                    return new LayoutSettingToolbarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_setting_toolbar is invalid. Received: " + tag);
            case 21:
                if ("layout/layout_setting_vip_portrait_0".equals(tag)) {
                    return new LayoutSettingVipPortraitBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_setting_vip_portrait is invalid. Received: " + tag);
            case 22:
                if ("layout/list_item_vip_support_add_image_0".equals(tag)) {
                    return new ListItemVipSupportAddImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for list_item_vip_support_add_image is invalid. Received: " + tag);
            case 23:
                if ("layout/list_item_vip_support_image_0".equals(tag)) {
                    return new ListItemVipSupportImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for list_item_vip_support_image is invalid. Received: " + tag);
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
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.payment.DataBinderMapperImpl());
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
            HashMap<String, Integer> hashMap = new HashMap<>(23);
            sKeys = hashMap;
            hashMap.put("layout/activity_account_0", Integer.valueOf(R.layout.activity_account));
            hashMap.put("layout/dialog_select_language_0", Integer.valueOf(R.layout.dialog_select_language));
            hashMap.put("layout/fragment_about_0", Integer.valueOf(R.layout.fragment_about));
            hashMap.put("layout/fragment_account_0", Integer.valueOf(R.layout.fragment_account));
            hashMap.put("layout/fragment_delete_account_0", Integer.valueOf(R.layout.fragment_delete_account));
            hashMap.put("layout/fragment_faq_and_help_0", Integer.valueOf(R.layout.fragment_faq_and_help));
            hashMap.put("layout/fragment_feedback_0", Integer.valueOf(R.layout.fragment_feedback));
            hashMap.put("layout/fragment_login_0", Integer.valueOf(R.layout.fragment_login));
            hashMap.put("layout/fragment_premuim_service_0", Integer.valueOf(R.layout.fragment_premuim_service));
            hashMap.put("layout/fragment_profile_0", Integer.valueOf(R.layout.fragment_profile));
            hashMap.put("layout/fragment_reset_password_0", Integer.valueOf(R.layout.fragment_reset_password));
            hashMap.put("layout/fragment_setting_0", Integer.valueOf(R.layout.fragment_setting));
            hashMap.put("layout/fragment_sign_up_0", Integer.valueOf(R.layout.fragment_sign_up));
            hashMap.put("layout/item_premium_server_0", Integer.valueOf(R.layout.item_premium_server));
            hashMap.put("layout/item_unvipcard_0", Integer.valueOf(R.layout.item_unvipcard));
            hashMap.put("layout/item_vipcard_0", Integer.valueOf(R.layout.item_vipcard));
            hashMap.put("layout/layout_check_email_0", Integer.valueOf(R.layout.layout_check_email));
            hashMap.put("layout/layout_confirm_password_0", Integer.valueOf(R.layout.layout_confirm_password));
            hashMap.put("layout/layout_reset_password_0", Integer.valueOf(R.layout.layout_reset_password));
            hashMap.put("layout/layout_setting_toolbar_0", Integer.valueOf(R.layout.layout_setting_toolbar));
            hashMap.put("layout/layout_setting_vip_portrait_0", Integer.valueOf(R.layout.layout_setting_vip_portrait));
            hashMap.put("layout/list_item_vip_support_add_image_0", Integer.valueOf(R.layout.list_item_vip_support_add_image));
            hashMap.put("layout/list_item_vip_support_image_0", Integer.valueOf(R.layout.list_item_vip_support_image));
        }
    }
}
