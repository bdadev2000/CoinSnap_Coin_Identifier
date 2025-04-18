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

/* loaded from: classes4.dex */
public class a implements NativeListener.NativeAdListener {
    private static final String a = "a";

    /* renamed from: b, reason: collision with root package name */
    private NativeListener.NativeAdListener f14055b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14056c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f14057d;

    /* renamed from: e, reason: collision with root package name */
    private Context f14058e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14059f;

    public a() {
    }

    public final void a(boolean z10) {
        this.f14059f = z10;
    }

    public final void b() {
        this.f14056c = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f14055b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f14055b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f14056c = false;
        NativeListener.NativeAdListener nativeAdListener = this.f14055b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f14058e == null) {
                this.f14058e = c.m().c();
            }
            if (!TextUtils.isEmpty(this.f14057d)) {
                com.mbridge.msdk.mbnative.e.a.a(this.f14058e, str, this.f14057d, this.f14059f, (CampaignEx) null);
            }
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f14056c = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f14055b != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f14055b.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f14055b.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f14055b;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public final void a(String str) {
        this.f14057d = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f14055b = nativeAdListener;
    }

    public final boolean a() {
        return this.f14056c;
    }

    public final void a(CampaignEx campaignEx, String str) {
        this.f14056c = false;
        NativeListener.NativeAdListener nativeAdListener = this.f14055b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f14058e == null) {
                this.f14058e = c.m().c();
            }
            if (TextUtils.isEmpty(this.f14057d)) {
                return;
            }
            com.mbridge.msdk.mbnative.e.a.a(this.f14058e, str, this.f14057d, this.f14059f, campaignEx);
        }
    }
}
