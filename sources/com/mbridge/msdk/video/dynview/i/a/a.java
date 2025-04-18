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

/* loaded from: classes4.dex */
public class a {
    private static volatile a a;

    /* renamed from: b, reason: collision with root package name */
    private View f15774b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f15775c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f15776d;

    private a() {
    }

    public final void b() {
        if (this.f15774b != null) {
            this.f15774b = null;
        }
        Bitmap bitmap = this.f15775c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f15775c.recycle();
            this.f15775c = null;
        }
        Bitmap bitmap2 = this.f15776d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f15776d.recycle();
            this.f15776d = null;
        }
    }

    public static a a() {
        a aVar;
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
                aVar = a;
            }
            return aVar;
        }
        return a;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.f15774b = view;
        int e2 = cVar.e();
        float d10 = cVar.d();
        float c10 = cVar.c();
        try {
            List<CampaignEx> g10 = cVar.g();
            String md5 = g10.get(0) != null ? SameMD5.getMD5(g10.get(0).getImageUrl()) : "";
            String md52 = g10.get(1) != null ? SameMD5.getMD5(g10.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(e2, d10, c10, bitmap, bitmap2);
        } catch (Exception e10) {
            ad.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(final int i10, final float f10, final float f11, final Bitmap bitmap, Bitmap bitmap2) {
        try {
            b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Bitmap a10 = o.a(bitmap, 10);
                        Bitmap a11 = o.a(bitmap, 10);
                        final a.C0206a a12 = com.mbridge.msdk.video.dynview.g.a.a();
                        a12.a(i10).a(a10).b(a11);
                        if (i10 == 2) {
                            float f12 = f10;
                            float f13 = f11;
                            if (f12 > f13) {
                                a12.a(f12).b(f11);
                            } else {
                                a12.a(f13).b(f10);
                            }
                        } else {
                            a12.a(f10).b(f11);
                        }
                        if (a.this.f15774b != null) {
                            a.this.f15774b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (a.this.f15774b != null && a12.a() != null) {
                                        a.this.f15774b.setBackground(a12.a());
                                    }
                                }
                            });
                        }
                    } catch (Exception e2) {
                        ad.b("ChoiceOneDrawBitBg", e2.getMessage());
                    }
                }
            });
        } catch (Exception e2) {
            ad.a("ChoiceOneDrawBitBg", e2.getMessage());
        }
    }
}
