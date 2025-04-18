package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f15709b;

    /* renamed from: c, reason: collision with root package name */
    private int f15710c;

    /* renamed from: d, reason: collision with root package name */
    private float f15711d;

    /* renamed from: e, reason: collision with root package name */
    private float f15712e;

    /* renamed from: f, reason: collision with root package name */
    private int f15713f;

    /* renamed from: g, reason: collision with root package name */
    private int f15714g;

    /* renamed from: h, reason: collision with root package name */
    private View f15715h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f15716i;

    /* renamed from: j, reason: collision with root package name */
    private int f15717j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15718k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f15719l;

    /* renamed from: m, reason: collision with root package name */
    private int f15720m;

    /* renamed from: n, reason: collision with root package name */
    private String f15721n;

    /* renamed from: o, reason: collision with root package name */
    private int f15722o;

    /* renamed from: p, reason: collision with root package name */
    private int f15723p;

    /* renamed from: q, reason: collision with root package name */
    private String f15724q;

    /* loaded from: classes4.dex */
    public static class a implements b {
        private Context a;

        /* renamed from: b, reason: collision with root package name */
        private String f15725b;

        /* renamed from: c, reason: collision with root package name */
        private int f15726c;

        /* renamed from: d, reason: collision with root package name */
        private float f15727d;

        /* renamed from: e, reason: collision with root package name */
        private float f15728e;

        /* renamed from: f, reason: collision with root package name */
        private int f15729f;

        /* renamed from: g, reason: collision with root package name */
        private int f15730g;

        /* renamed from: h, reason: collision with root package name */
        private View f15731h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f15732i;

        /* renamed from: j, reason: collision with root package name */
        private int f15733j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15734k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f15735l;

        /* renamed from: m, reason: collision with root package name */
        private int f15736m;

        /* renamed from: n, reason: collision with root package name */
        private String f15737n;

        /* renamed from: o, reason: collision with root package name */
        private int f15738o;

        /* renamed from: p, reason: collision with root package name */
        private int f15739p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f15740q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f10) {
            this.f15728e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i10) {
            this.f15730g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i10) {
            this.f15733j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i10) {
            this.f15736m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i10) {
            this.f15738o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i10) {
            this.f15739p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.f15725b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i10) {
            this.f15729f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f15740q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i10) {
            this.f15726c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.f15735l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f10) {
            this.f15727d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f15737n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f15731h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f15732i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z10) {
            this.f15734k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final c a() {
            return new c(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(float f10);

        b a(int i10);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<CampaignEx> list);

        b a(boolean z10);

        c a();

        b b(float f10);

        b b(int i10);

        b b(String str);

        b b(List<String> list);

        b c(int i10);

        b c(String str);

        b d(int i10);

        b e(int i10);

        b f(int i10);

        b g(int i10);
    }

    public final Context a() {
        return this.a;
    }

    public final String b() {
        return this.f15709b;
    }

    public final float c() {
        return this.f15711d;
    }

    public final float d() {
        return this.f15712e;
    }

    public final int e() {
        return this.f15713f;
    }

    public final View f() {
        return this.f15715h;
    }

    public final List<CampaignEx> g() {
        return this.f15716i;
    }

    public final int h() {
        return this.f15710c;
    }

    public final int i() {
        return this.f15717j;
    }

    public final int j() {
        return this.f15714g;
    }

    public final boolean k() {
        return this.f15718k;
    }

    public final List<String> l() {
        return this.f15719l;
    }

    public final int m() {
        return this.f15722o;
    }

    public final int n() {
        return this.f15723p;
    }

    public final String o() {
        return this.f15724q;
    }

    private c(a aVar) {
        this.f15712e = aVar.f15728e;
        this.f15711d = aVar.f15727d;
        this.f15713f = aVar.f15729f;
        this.f15714g = aVar.f15730g;
        this.a = aVar.a;
        this.f15709b = aVar.f15725b;
        this.f15710c = aVar.f15726c;
        this.f15715h = aVar.f15731h;
        this.f15716i = aVar.f15732i;
        this.f15717j = aVar.f15733j;
        this.f15718k = aVar.f15734k;
        this.f15719l = aVar.f15735l;
        this.f15720m = aVar.f15736m;
        this.f15721n = aVar.f15737n;
        this.f15722o = aVar.f15738o;
        this.f15723p = aVar.f15739p;
        this.f15724q = aVar.f15740q;
    }
}
