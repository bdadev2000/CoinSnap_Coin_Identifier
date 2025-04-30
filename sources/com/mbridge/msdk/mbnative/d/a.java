package com.mbridge.msdk.mbnative.d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class a implements NativeListener.NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16560a = "a";
    private NativeListener.NativeAdListener b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16561c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f16562d;

    /* renamed from: e, reason: collision with root package name */
    private Context f16563e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16564f;

    public a() {
    }

    public final void a(boolean z8) {
        this.f16564f = z8;
    }

    public final void b() {
        this.f16561c = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f16561c = false;
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f16563e == null) {
                this.f16563e = c.m().c();
            }
            if (!TextUtils.isEmpty(this.f16562d)) {
                com.mbridge.msdk.mbnative.e.a.a(this.f16563e, str, this.f16562d, this.f16564f, (CampaignEx) null);
            }
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i9) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f16561c = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.b != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.b.onAdLoaded(copyOnWriteArrayList, i9);
                } else {
                    this.b.onAdLoaded(list, i9);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i9) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i9);
        }
    }

    public final void a(String str) {
        this.f16562d = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.b = nativeAdListener;
    }

    public final boolean a() {
        return this.f16561c;
    }

    public final void a(CampaignEx campaignEx, String str) {
        this.f16561c = false;
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f16563e == null) {
                this.f16563e = c.m().c();
            }
            if (TextUtils.isEmpty(this.f16562d)) {
                return;
            }
            com.mbridge.msdk.mbnative.e.a.a(this.f16563e, str, this.f16562d, this.f16564f, campaignEx);
        }
    }
}
