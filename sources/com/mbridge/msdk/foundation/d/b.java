package com.mbridge.msdk.foundation.d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import eb.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class b {
    public static int a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static int f13102b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f13103c = false;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f13104d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.d.a.a> f13105e;

    /* renamed from: f, reason: collision with root package name */
    private g f13106f;

    /* loaded from: classes4.dex */
    public static class a {
        private static final b a = new b();
    }

    private com.mbridge.msdk.foundation.d.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (this.f13105e.containsKey(str)) {
            return this.f13105e.get(str);
        }
        return null;
    }

    public final void a(String str, int i10, int i11, String str2, String str3) {
        com.mbridge.msdk.foundation.d.a.a d10 = d(j.k(str, "_1"));
        if (d10 == null) {
            d10 = d(j.k(str, "_2"));
            if (d10 == null && (d10 = d(j.k(str, "_3"))) == null && (d10 = d(j.k(str, "_4"))) == null) {
                d10 = a(str);
            } else {
                d10.b(0);
            }
        }
        if (d10 != null) {
            CampaignEx c10 = d10.c();
            i.a(c10, c10 != null ? c10.getCampaignUnitId() : "", d10.g(), d10.f(), !TextUtils.isEmpty(str2) ? str2 : "", i10, c10 != null ? c10.getAdType() : 0, i11, str3);
        }
    }

    public final boolean b() {
        g d10 = e.d(h.a());
        this.f13106f = d10;
        if (d10 != null) {
            return false;
        }
        h.a();
        this.f13106f = com.mbridge.msdk.c.i.a();
        return false;
    }

    public final void c(String str) {
        try {
            com.mbridge.msdk.foundation.d.a.a d10 = d(str);
            if (d10 != null) {
                d10.a();
            }
            this.f13105e.remove(str);
            f13103c = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private b() {
        this.f13104d = new RelativeLayout.LayoutParams(f13102b, a);
        this.f13105e = new ConcurrentHashMap<>();
    }

    public final FeedBackButton b(String str) {
        return a(str).d();
    }

    public final void b(String str, int i10) {
        a(str).b(i10);
    }

    public static b a() {
        return a.a;
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.d.a aVar) {
        if (b()) {
            com.mbridge.msdk.foundation.d.a.a a10 = a(str);
            if (aVar != null) {
                a10.a(new a.C0169a(str, aVar));
            }
            FeedBackButton d10 = a10.d();
            if (d10 != null) {
                if (layoutParams == null) {
                    int a11 = e.a(10.0f);
                    this.f13104d.setMargins(a11, a11, a11, a11);
                    layoutParams = this.f13104d;
                }
                ViewGroup viewGroup2 = (ViewGroup) d10.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(d10);
                }
                Activity a12 = a(context);
                if (a12 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a12.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(d10);
                    viewGroup.addView(d10, layoutParams);
                }
            }
        }
    }

    public final com.mbridge.msdk.foundation.d.a.a a(String str) {
        com.mbridge.msdk.foundation.d.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (!this.f13105e.containsKey(str)) {
            aVar = new com.mbridge.msdk.foundation.d.a.a(str);
            this.f13105e.put(str, aVar);
        } else {
            aVar = this.f13105e.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.d.a.a aVar2 = new com.mbridge.msdk.foundation.d.a.a(str);
        this.f13105e.put(str, aVar2);
        return aVar2;
    }

    public final Activity a(Context context) {
        Activity activity;
        Context e2 = c.m().e();
        Activity activity2 = null;
        try {
            Activity activity3 = e2 instanceof Activity ? (Activity) e2 : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> a10 = c.m().a();
                if (a10 != null && (activity = a10.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e10) {
                e = e10;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void a(String str, int i10, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.d.a.a a10 = a(str);
        if (a10.d() != null) {
            a10.c(i10);
            if (i10 == 0) {
                a(str, c.m().c(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.d.a) null);
            }
        }
    }

    public final void a(String str, int i10, int i11, int i12, float f10, float f11, float f12, String str2, String str3, float f13, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.d.a.a a10 = a(str);
        Context c10 = c.m().c();
        a10.a(ai.a(c10, f10), ai.a(c10, f11), ai.a(c10, i10), ai.a(c10, i11), ai.a(c10, i12), f12, str2, str3, f13, jSONArray);
    }

    public final void a(String str, int i10, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a10 = a(str);
        a10.a(new a.C0169a(str, aVar));
        if (i10 == 1) {
            a10.b();
        } else {
            a10.e();
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        a(str).a(campaignEx);
    }

    public final void a(String str, String str2) {
        a(str).a(str2);
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }

    public final void a(String str, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a10 = a(str);
        if (aVar != null) {
            a10.a(new a.C0169a(str, aVar));
        }
    }

    public final void a(String str, int i10) {
        a(str).a(i10);
    }

    public final boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            ad.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a10 = a(context);
        if (a10 == null || mBFeedBackDialog == null || a10.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a10.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
