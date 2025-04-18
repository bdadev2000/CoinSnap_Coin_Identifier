package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes2.dex */
public class qc {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f26168a = new StringBuilder();

    public qc a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z2 = bVar instanceof aq;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z2 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z2) {
            a("VAST DSP", ((aq) bVar).r1());
        }
        return this;
    }

    public qc b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.e0()).a("close_style", bVar.m()).a("close_delay_graphic", Long.valueOf(bVar.o()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.j1().substring(0, Math.min(aVar.j1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.l0()), "s").a("skip_style", bVar.c0()).a("Streaming", Boolean.valueOf(bVar.I0())).a("Video Location", bVar.P()).a("video_button_properties", bVar.j0());
        }
        return this;
    }

    public String toString() {
        return this.f26168a.toString();
    }

    public qc a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", zq.a(appLovinAdView.getVisibility()));
    }

    public qc a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public qc a() {
        this.f26168a.append("\n========================================");
        return this;
    }

    public qc b(String str) {
        this.f26168a.append(str);
        return this;
    }

    public qc a(ge geVar) {
        return a("Network", geVar.c()).a("Adapter Version", geVar.z()).a("Format", geVar.getFormat().getLabel()).a("Ad Unit ID", geVar.getAdUnitId()).a("Placement", geVar.getPlacement()).a("Network Placement", geVar.U()).a("Serve ID", geVar.S()).a("Creative ID", StringUtils.isValidString(geVar.getCreativeId()) ? geVar.getCreativeId() : "None").a("Ad Review Creative ID", StringUtils.isValidString(geVar.getAdReviewCreativeId()) ? geVar.getAdReviewCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(geVar.v()) ? geVar.v() : "None").a("DSP Name", StringUtils.isValidString(geVar.getDspName()) ? geVar.getDspName() : "None").a("DSP ID", StringUtils.isValidString(geVar.getDspId()) ? geVar.getDspId() : "None").a("Server Parameters", geVar.l());
    }

    public qc a(com.applovin.impl.sdk.j jVar) {
        return a("Muted", Boolean.valueOf(jVar.g0().isMuted()));
    }

    public qc a(String str) {
        StringBuilder sb = this.f26168a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public qc a(String str, Object obj) {
        return a(str, obj, "");
    }

    public qc a(String str, Object obj, String str2) {
        StringBuilder sb = this.f26168a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }
}
