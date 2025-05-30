package com.applovin.impl;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0688e0 {
    public static String a(Context context, AttributeSet attributeSet, String str, String str2) {
        if (context == null || attributeSet == null || str == null || str2 == null) {
            return null;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeValue(str, str2);
        }
        return context.getResources().getString(attributeResourceValue);
    }

    public static boolean b(AttributeSet attributeSet) {
        if (attributeSet == null || !attributeSet.getAttributeBooleanValue(AppLovinAdView.NAMESPACE, "loadAdOnCreate", false)) {
            return false;
        }
        return true;
    }

    public static MaxAdFormat a(Context context) {
        return (AppLovinSdkUtils.isTablet(context) || AppLovinSdkUtils.isTv(context)) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    public static boolean a(View view) {
        if (view == null || view.getRootView() == null || !(view.getRootView().getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return false;
        }
        int i9 = ((WindowManager.LayoutParams) view.getRootView().getLayoutParams()).type;
        return i9 == 2002 || i9 == 2007 || i9 == 2003 || i9 == 2010 || i9 == 2006 || (Build.VERSION.SDK_INT >= 26 && i9 == 2038);
    }

    public static void a(ViewGroup viewGroup, View view) {
        if (viewGroup == null) {
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild == -1) {
            viewGroup.removeAllViews();
        } else {
            viewGroup.removeViews(0, indexOfChild);
            viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        }
    }

    public static AppLovinAdSize a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "size");
        if (StringUtils.isValidString(attributeValue)) {
            return AppLovinAdSize.fromString(attributeValue);
        }
        return null;
    }
}
