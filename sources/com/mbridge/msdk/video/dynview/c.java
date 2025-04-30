package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f18571a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f18572c;

    /* renamed from: d, reason: collision with root package name */
    private float f18573d;

    /* renamed from: e, reason: collision with root package name */
    private float f18574e;

    /* renamed from: f, reason: collision with root package name */
    private int f18575f;

    /* renamed from: g, reason: collision with root package name */
    private int f18576g;

    /* renamed from: h, reason: collision with root package name */
    private View f18577h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f18578i;

    /* renamed from: j, reason: collision with root package name */
    private int f18579j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18580k;
    private List<String> l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private String f18581n;

    /* renamed from: o, reason: collision with root package name */
    private int f18582o;

    /* renamed from: p, reason: collision with root package name */
    private int f18583p;

    /* renamed from: q, reason: collision with root package name */
    private String f18584q;

    /* loaded from: classes3.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f18585a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f18586c;

        /* renamed from: d, reason: collision with root package name */
        private float f18587d;

        /* renamed from: e, reason: collision with root package name */
        private float f18588e;

        /* renamed from: f, reason: collision with root package name */
        private int f18589f;

        /* renamed from: g, reason: collision with root package name */
        private int f18590g;

        /* renamed from: h, reason: collision with root package name */
        private View f18591h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f18592i;

        /* renamed from: j, reason: collision with root package name */
        private int f18593j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18594k;
        private List<String> l;
        private int m;

        /* renamed from: n, reason: collision with root package name */
        private String f18595n;

        /* renamed from: o, reason: collision with root package name */
        private int f18596o;

        /* renamed from: p, reason: collision with root package name */
        private int f18597p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f18598q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.f18585a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f9) {
            this.f18588e = f9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i9) {
            this.f18590g = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i9) {
            this.f18593j = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i9) {
            this.m = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i9) {
            this.f18596o = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i9) {
            this.f18597p = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i9) {
            this.f18589f = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f18598q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i9) {
            this.f18586c = i9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f9) {
            this.f18587d = f9;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f18595n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f18591h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f18592i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z8) {
            this.f18594k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final c a() {
            return new c(this);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        b a(float f9);

        b a(int i9);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<CampaignEx> list);

        b a(boolean z8);

        c a();

        b b(float f9);

        b b(int i9);

        b b(String str);

        b b(List<String> list);

        b c(int i9);

        b c(String str);

        b d(int i9);

        b e(int i9);

        b f(int i9);

        b g(int i9);
    }

    public final Context a() {
        return this.f18571a;
    }

    public final String b() {
        return this.b;
    }

    public final float c() {
        return this.f18573d;
    }

    public final float d() {
        return this.f18574e;
    }

    public final int e() {
        return this.f18575f;
    }

    public final View f() {
        return this.f18577h;
    }

    public final List<CampaignEx> g() {
        return this.f18578i;
    }

    public final int h() {
        return this.f18572c;
    }

    public final int i() {
        return this.f18579j;
    }

    public final int j() {
        return this.f18576g;
    }

    public final boolean k() {
        return this.f18580k;
    }

    public final List<String> l() {
        return this.l;
    }

    public final int m() {
        return this.f18582o;
    }

    public final int n() {
        return this.f18583p;
    }

    public final String o() {
        return this.f18584q;
    }

    private c(a aVar) {
        this.f18574e = aVar.f18588e;
        this.f18573d = aVar.f18587d;
        this.f18575f = aVar.f18589f;
        this.f18576g = aVar.f18590g;
        this.f18571a = aVar.f18585a;
        this.b = aVar.b;
        this.f18572c = aVar.f18586c;
        this.f18577h = aVar.f18591h;
        this.f18578i = aVar.f18592i;
        this.f18579j = aVar.f18593j;
        this.f18580k = aVar.f18594k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.f18581n = aVar.f18595n;
        this.f18582o = aVar.f18596o;
        this.f18583p = aVar.f18597p;
        this.f18584q = aVar.f18598q;
    }
}
