package com.bytedance.sdk.component.YFl;

import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.YFl.AlY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lG {
    static Ne YFl;
    private final nc AlY;
    private final YFl Sg;
    private final WebView tN;

    /* renamed from: vc, reason: collision with root package name */
    private volatile boolean f10343vc;
    private final List<pDU> wN;

    public lG(nc ncVar) {
        ArrayList arrayList = new ArrayList();
        this.wN = arrayList;
        this.f10343vc = false;
        this.AlY = ncVar;
        if (ncVar.qsH && YFl != null) {
            throw null;
        }
        if (ncVar.YFl != null) {
            YFl yFl = ncVar.Sg;
            if (yFl == null) {
                this.Sg = new UZM();
            } else {
                this.Sg = yFl;
            }
        } else {
            this.Sg = ncVar.Sg;
        }
        this.Sg.YFl(ncVar, (wXo) null);
        this.tN = ncVar.YFl;
        arrayList.add(ncVar.f10344nc);
        bZ.YFl(ncVar.DSW);
    }

    private void Sg() {
        if (this.f10343vc) {
            NjR.YFl(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static nc YFl(WebView webView) {
        return new nc(webView);
    }

    public lG YFl(String str, wN<?, ?> wNVar) {
        return YFl(str, (String) null, wNVar);
    }

    @UiThread
    public lG YFl(String str, String str2, wN<?, ?> wNVar) {
        Sg();
        this.Sg.DSW.YFl(str, wNVar);
        return this;
    }

    public lG YFl(String str, AlY.Sg sg2) {
        return YFl(str, (String) null, sg2);
    }

    @UiThread
    public lG YFl(String str, String str2, AlY.Sg sg2) {
        Sg();
        this.Sg.DSW.YFl(str, sg2);
        return this;
    }

    public void YFl() {
        if (this.f10343vc) {
            return;
        }
        this.Sg.Sg();
        this.f10343vc = true;
        Iterator<pDU> it = this.wN.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
