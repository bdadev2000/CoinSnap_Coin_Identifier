package com.mbridge.msdk.foundation.same.g;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class a implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private String f15768a;
    private CampaignEx b;

    public a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public final void a(String str) {
        this.f15768a = str;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
    }

    public a() {
    }
}
