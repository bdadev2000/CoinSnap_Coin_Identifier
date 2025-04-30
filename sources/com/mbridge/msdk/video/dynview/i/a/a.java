package com.mbridge.msdk.video.dynview.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.f.b;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.g.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f18635a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f18636c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f18637d;

    private a() {
    }

    public final void b() {
        if (this.b != null) {
            this.b = null;
        }
        Bitmap bitmap = this.f18636c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f18636c.recycle();
            this.f18636c = null;
        }
        Bitmap bitmap2 = this.f18637d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f18637d.recycle();
            this.f18637d = null;
        }
    }

    public static a a() {
        a aVar;
        if (f18635a == null) {
            synchronized (a.class) {
                try {
                    if (f18635a == null) {
                        f18635a = new a();
                    }
                    aVar = f18635a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return f18635a;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.b = view;
        int e4 = cVar.e();
        float d2 = cVar.d();
        float c9 = cVar.c();
        try {
            List<CampaignEx> g9 = cVar.g();
            String md5 = g9.get(0) != null ? SameMD5.getMD5(g9.get(0).getImageUrl()) : "";
            String md52 = g9.get(1) != null ? SameMD5.getMD5(g9.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(e4, d2, c9, bitmap, bitmap2);
        } catch (Exception e9) {
            ad.b("ChoiceOneDrawBitBg", e9.getMessage());
        }
    }

    private synchronized void a(final int i9, final float f9, final float f10, final Bitmap bitmap, Bitmap bitmap2) {
        try {
            b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Bitmap a6 = o.a(bitmap, 10);
                        Bitmap a9 = o.a(bitmap, 10);
                        final a.C0194a a10 = com.mbridge.msdk.video.dynview.g.a.a();
                        a10.a(i9).a(a6).b(a9);
                        if (i9 == 2) {
                            float f11 = f9;
                            float f12 = f10;
                            if (f11 > f12) {
                                a10.a(f11).b(f10);
                            } else {
                                a10.a(f12).b(f9);
                            }
                        } else {
                            a10.a(f9).b(f10);
                        }
                        if (a.this.b != null) {
                            a.this.b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (a.this.b != null && a10.a() != null) {
                                        a.this.b.setBackground(a10.a());
                                    }
                                }
                            });
                        }
                    } catch (Exception e4) {
                        ad.b("ChoiceOneDrawBitBg", e4.getMessage());
                    }
                }
            });
        } catch (Exception e4) {
            ad.a("ChoiceOneDrawBitBg", e4.getMessage());
        }
    }
}
