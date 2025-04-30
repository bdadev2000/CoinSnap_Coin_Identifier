package com.mbridge.msdk.foundation.d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f15466a = -2;
    public static int b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f15467c = false;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f15468d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.d.a.a> f15469e;

    /* renamed from: f, reason: collision with root package name */
    private g f15470f;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f15471a = new b();
    }

    public static b a() {
        return a.f15471a;
    }

    private com.mbridge.msdk.foundation.d.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (this.f15469e.containsKey(str)) {
            return this.f15469e.get(str);
        }
        return null;
    }

    public final boolean b() {
        g f9 = L.f(h.a());
        this.f15470f = f9;
        if (f9 != null) {
            return false;
        }
        h.a();
        this.f15470f = i.a();
        return false;
    }

    public final void c(String str) {
        try {
            com.mbridge.msdk.foundation.d.a.a d2 = d(str);
            if (d2 != null) {
                d2.a();
            }
            this.f15469e.remove(str);
            f15467c = false;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private b() {
        this.f15468d = new RelativeLayout.LayoutParams(b, f15466a);
        this.f15469e = new ConcurrentHashMap<>();
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.d.a aVar) {
        if (b()) {
            com.mbridge.msdk.foundation.d.a.a a6 = a(str);
            if (aVar != null) {
                a6.a(new a.C0157a(str, aVar));
            }
            FeedBackButton d2 = a6.d();
            if (d2 != null) {
                if (layoutParams == null) {
                    int a9 = L.a(10.0f);
                    this.f15468d.setMargins(a9, a9, a9, a9);
                    layoutParams = this.f15468d;
                }
                ViewGroup viewGroup2 = (ViewGroup) d2.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(d2);
                }
                Activity a10 = a(context);
                if (a10 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a10.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(d2);
                    viewGroup.addView(d2, layoutParams);
                }
            }
        }
    }

    public final FeedBackButton b(String str) {
        return a(str).d();
    }

    public final void b(String str, int i9) {
        a(str).b(i9);
    }

    public final com.mbridge.msdk.foundation.d.a.a a(String str) {
        com.mbridge.msdk.foundation.d.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (!this.f15469e.containsKey(str)) {
            aVar = new com.mbridge.msdk.foundation.d.a.a(str);
            this.f15469e.put(str, aVar);
        } else {
            aVar = this.f15469e.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.d.a.a aVar2 = new com.mbridge.msdk.foundation.d.a.a(str);
        this.f15469e.put(str, aVar2);
        return aVar2;
    }

    public final Activity a(Context context) {
        Activity activity;
        Context e4 = c.m().e();
        Activity activity2 = null;
        try {
            Activity activity3 = e4 instanceof Activity ? (Activity) e4 : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> a6 = c.m().a();
                if (a6 != null && (activity = a6.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e9) {
                e = e9;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void a(String str, int i9, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.d.a.a a6 = a(str);
        if (a6.d() != null) {
            a6.c(i9);
            if (i9 == 0) {
                a(str, c.m().c(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.d.a) null);
            }
        }
    }

    public final void a(String str, int i9, int i10, int i11, float f9, float f10, float f11, String str2, String str3, float f12, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.d.a.a a6 = a(str);
        Context c9 = c.m().c();
        a6.a(ai.a(c9, f9), ai.a(c9, f10), ai.a(c9, i9), ai.a(c9, i10), ai.a(c9, i11), f11, str2, str3, f12, jSONArray);
    }

    public final void a(String str, int i9, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a6 = a(str);
        a6.a(new a.C0157a(str, aVar));
        if (i9 == 1) {
            a6.b();
        } else {
            a6.e();
        }
    }

    public final void a(String str, int i9, int i10, String str2, String str3) {
        com.mbridge.msdk.foundation.d.a.a d2 = d(o.j(str, "_1"));
        if (d2 == null) {
            d2 = d(o.j(str, "_2"));
            if (d2 == null && (d2 = d(o.j(str, "_3"))) == null && (d2 = d(o.j(str, "_4"))) == null) {
                d2 = a(str);
            } else {
                d2.b(0);
            }
        }
        if (d2 != null) {
            CampaignEx c9 = d2.c();
            com.mbridge.msdk.foundation.same.report.i.a(c9, c9 != null ? c9.getCampaignUnitId() : "", d2.g(), d2.f(), !TextUtils.isEmpty(str2) ? str2 : "", i9, c9 != null ? c9.getAdType() : 0, i10, str3);
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
        com.mbridge.msdk.foundation.d.a.a a6 = a(str);
        if (aVar != null) {
            a6.a(new a.C0157a(str, aVar));
        }
    }

    public final void a(String str, int i9) {
        a(str).a(i9);
    }

    public final boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            ad.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a6 = a(context);
        if (a6 == null || mBFeedBackDialog == null || a6.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a6.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
