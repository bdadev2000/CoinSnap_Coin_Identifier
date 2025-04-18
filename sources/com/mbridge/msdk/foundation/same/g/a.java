package com.mbridge.msdk.foundation.same.g;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class a implements DownloadListener {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f13361b;

    public a(CampaignEx campaignEx) {
        this.f13361b = campaignEx;
    }

    public final void a(String str) {
        this.a = str;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
    }

    public a() {
    }
}
