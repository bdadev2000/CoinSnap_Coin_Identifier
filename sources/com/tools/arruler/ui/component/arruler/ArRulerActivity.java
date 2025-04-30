package com.tools.arruler.ui.component.arruler;

import B1.f;
import E6.b;
import F1.i;
import F2.h;
import G7.j;
import G7.s;
import I6.e;
import U4.v;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.AbstractC0405f;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.d0;
import androidx.recyclerview.widget.RecyclerView;
import com.core.ar.model.Tool;
import com.mbridge.msdk.foundation.entity.o;
import com.skydoves.balloon.radius.RadiusLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import f.x;
import j6.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.C2426o;
import n1.C2475f;
import o7.C2513b;
import p1.C2538b;
import q2.InterfaceC2640a;
import q7.InterfaceC2649b;
import r2.C2657a;
import r6.c;
import s2.d;
import u6.AbstractC2785a;
import u7.AbstractC2817h;
import x6.AbstractActivityC2926b;
import z6.ViewOnClickListenerC2978a;

/* loaded from: classes3.dex */
public final class ArRulerActivity extends AbstractActivityC2926b implements InterfaceC2640a, InterfaceC2649b {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f19637r = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19638f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19639g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19640h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19641i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19642j;

    /* renamed from: k, reason: collision with root package name */
    public m f19643k;
    public m l;
    public m m;

    /* renamed from: n, reason: collision with root package name */
    public C2657a f19644n;

    /* renamed from: o, reason: collision with root package name */
    public final i f19645o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19646p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19647q;

    public ArRulerActivity() {
        addOnContextAvailableListener(new b(this, 6));
        this.f19642j = true;
        this.f19645o = new i(s.a(z6.i.class), new e(this, 14), new e(this, 13), new e(this, 15));
        this.f19646p = true;
        this.f19647q = true;
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return t().a();
    }

    @Override // f.l
    public final d0 getDefaultViewModelProviderFactory() {
        return h.m(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r2.a, B1.f] */
    public final void init() {
        runOnUiThread(new C2.b(22));
        ?? fVar = new f(6, false);
        WeakReference weakReference = new WeakReference(this);
        fVar.f273c = weakReference;
        WeakReference weakReference2 = new WeakReference((Activity) weakReference.get());
        Point point = new Point();
        ((Activity) weakReference2.get()).getWindowManager().getDefaultDisplay().getSize(point);
        fVar.f22814f = point;
        fVar.f22813d = new d();
        fVar.f22816h = new ArrayList(16);
        j.b(fVar.f22814f);
        float f9 = r1.x / 2.0f;
        j.b(fVar.f22814f);
        fVar.f22815g = MotionEvent.obtain(0L, 0L, 0, f9, r1.y / 2.0f, 0);
        this.f19644n = fVar;
        AbstractC0505o lifecycle = getLifecycle();
        C2657a c2657a = this.f19644n;
        j.b(c2657a);
        lifecycle.a(c2657a);
        ((AbstractC2785a) k()).f23258y.setOnClickListener(new ViewOnClickListenerC2978a(this, 3));
        AbstractC2785a abstractC2785a = (AbstractC2785a) k();
        C2657a c2657a2 = this.f19644n;
        j.b(c2657a2);
        abstractC2785a.f23251r.setPoint(c2657a2.f22814f);
        AbstractC2785a abstractC2785a2 = (AbstractC2785a) k();
        C2657a c2657a3 = this.f19644n;
        j.b(c2657a3);
        abstractC2785a2.f23251r.setTapHelper(c2657a3.f22813d);
        AbstractC2785a abstractC2785a3 = (AbstractC2785a) k();
        C2657a c2657a4 = this.f19644n;
        j.b(c2657a4);
        abstractC2785a3.f23251r.setAnchorList(c2657a4.f22816h);
        AbstractC2785a abstractC2785a4 = (AbstractC2785a) k();
        C2657a c2657a5 = this.f19644n;
        j.b(c2657a5);
        abstractC2785a4.f23251r.setMotionEvent(c2657a5.f22815g);
        ((AbstractC2785a) k()).f23251r.setArRulerCallBack(this);
    }

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_ar_ruler;
    }

    @Override // f.l, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        a7.b bVar = a7.b.f4076f;
        if (bVar != null) {
            bVar.A("FIRST_RATE", true);
            return;
        }
        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = t().c();
            this.f19638f = c9;
            if (c9.a()) {
                this.f19638f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        v();
        ((AbstractC2785a) k()).f23246D.setAdapter(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((AbstractC2785a) k()).f23251r.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, f.l, android.app.Activity
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        j.e(strArr, "permissions");
        j.e(iArr, "grantResults");
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr[0] == 0) {
            init();
        } else if (I.h.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            init();
        } else {
            AbstractC0405f.a(this, new String[]{"android.permission.CAMERA"}, 0);
        }
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((AbstractC2785a) k()).f23251r.onResume();
        A6.b bVar = new A6.b(new z6.b(this, 2));
        String string = getString(R.string.line_height);
        j.d(string, "getString(...)");
        Tool tool = new Tool(R.drawable.ic_tool_line, string, false, 4, null);
        String string2 = getString(R.string.angle);
        j.d(string2, "getString(...)");
        Tool tool2 = new Tool(R.drawable.ic_tool_angle, string2, C2538b.a().m);
        String string3 = getString(R.string.distance);
        j.d(string3, "getString(...)");
        Tool tool3 = new Tool(R.drawable.ic_tool_distance, string3, false, 4, null);
        String string4 = getString(R.string.polyline);
        j.d(string4, "getString(...)");
        List B5 = AbstractC2817h.B(tool, tool2, tool3, new Tool(R.drawable.ic_tool_polyline, string4, C2538b.a().m));
        ArrayList arrayList = bVar.f79k;
        arrayList.clear();
        arrayList.addAll(B5);
        bVar.notifyDataSetChanged();
        j6.j jVar = new j6.j(this);
        jVar.f21127H = Integer.valueOf(R.layout.layout_rcv_tool);
        jVar.f21148d = 0.6f;
        jVar.a(0);
        jVar.b(180);
        float f9 = 16;
        jVar.f21155k = o.f(1, f9);
        jVar.f21154j = o.f(1, f9);
        jVar.f21163u = TypedValue.applyDimension(1, 16.0f, Resources.getSystem().getDisplayMetrics());
        jVar.f21162t = I.h.getColor(this, R.color.color_black_60);
        jVar.f21133N = this;
        jVar.f21128I = false;
        jVar.f21143Y = false;
        m mVar = new m(this, jVar);
        this.m = mVar;
        RadiusLayout radiusLayout = (RadiusLayout) mVar.f21172d.f24547d;
        j.d(radiusLayout, "balloonCard");
        RecyclerView recyclerView = (RecyclerView) radiusLayout.findViewById(R.id.rcvTool);
        if (recyclerView != null) {
            recyclerView.setAdapter(bVar);
        }
        AppCompatImageView appCompatImageView = ((AbstractC2785a) k()).f23259z;
        j.d(appCompatImageView, "imgTool");
        com.bumptech.glide.d.I(appCompatImageView, new z6.b(this, 3));
        try {
            u();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        boolean v6 = a.v(this);
        r6.b bVar = c.f22895g;
        q6.b bVar2 = q6.c.f22801e;
        if (v6 && bVar2.a().a() && !C2538b.a().m) {
            bVar.d().a(this, "ca-app-pub-6691965685689933/1923984700");
        }
        if (a.v(this) && bVar2.a().c() && a.v(this) && !C2538b.a().m) {
            bVar.d().a(this, "ca-app-pub-6691965685689933/3105080728");
        }
        int i9 = 0;
        if (I.h.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            init();
        } else {
            AbstractC0405f.a(this, new String[]{"android.permission.CAMERA"}, 0);
        }
        A6.b bVar3 = new A6.b(new z6.b(this, 1), (byte) 0);
        z7.b bVar4 = t2.a.f23004g;
        j.e(bVar4, "items");
        ArrayList arrayList = bVar3.f79k;
        arrayList.clear();
        arrayList.addAll(bVar4);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((t2.a) it.next()) == t2.a.f23002d) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        bVar3.l = i9;
        bVar3.notifyDataSetChanged();
        ((AbstractC2785a) k()).f23247E.setAdapter(bVar3);
        AbstractC2785a abstractC2785a = (AbstractC2785a) k();
        abstractC2785a.f23249G.setText(((t2.a) arrayList.get(bVar3.l)).b);
        AbstractC2785a abstractC2785a2 = (AbstractC2785a) k();
        abstractC2785a2.f23249G.setOnClickListener(new F6.c(2, this, bVar3));
        ((AbstractC2785a) k()).f23244B.setImageAssetsFolder("images");
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2785a abstractC2785a = (AbstractC2785a) k();
        int i9 = 4;
        abstractC2785a.f23254u.setOnClickListener(new ViewOnClickListenerC2978a(this, i9));
        x onBackPressedDispatcher = getOnBackPressedDispatcher();
        z6.b bVar = new z6.b(this, i9);
        j.e(onBackPressedDispatcher, "<this>");
        onBackPressedDispatcher.b(new E6.e(true, bVar));
        AbstractC2785a abstractC2785a2 = (AbstractC2785a) k();
        abstractC2785a2.f23256w.setOnClickListener(new ViewOnClickListenerC2978a(this, 0));
        AbstractC2785a abstractC2785a3 = (AbstractC2785a) k();
        abstractC2785a3.f23251r.setOnClickListener(new ViewOnClickListenerC2978a(this, 1));
        AppCompatImageView appCompatImageView = ((AbstractC2785a) k()).f23257x;
        j.d(appCompatImageView, "imgQuestion");
        com.bumptech.glide.d.I(appCompatImageView, new z6.b(this, 0));
        AbstractC2785a abstractC2785a4 = (AbstractC2785a) k();
        abstractC2785a4.f23255v.setOnClickListener(new ViewOnClickListenerC2978a(this, 2));
        AbstractC2785a abstractC2785a5 = (AbstractC2785a) k();
        abstractC2785a5.f23251r.setArSurfaceListener(new com.bumptech.glide.f(this, 16));
    }

    public final C2513b t() {
        if (this.f19639g == null) {
            synchronized (this.f19640h) {
                try {
                    if (this.f19639g == null) {
                        this.f19639g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19639g;
    }

    public final void u() {
        if (a.v(this)) {
            q6.c a6 = q6.c.f22801e.a();
            boolean z8 = false;
            try {
                if (a6.f22803a) {
                    k5.b bVar = a6.f22805d;
                    if (bVar != null) {
                        z8 = bVar.c("banner_Ar");
                    } else {
                        j.k("remoteConfig");
                        throw null;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (z8 && a.v(this) && !C2538b.a().m) {
                C2475f p2 = C2475f.p();
                C6.b bVar2 = new C6.b(this, 5);
                p2.getClass();
                C2475f.s(this, "ca-app-pub-6691965685689933/9610903034", bVar2);
                return;
            }
        }
        ((AbstractC2785a) k()).f23250q.removeAllViews();
    }

    public final void v() {
        super.onDestroy();
        C2426o c2426o = this.f19638f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    public final void w(F7.a aVar) {
        if (a.v(this) && q6.c.f22801e.a().c() && !C2538b.a().m) {
            c.f22895g.d().b(this, "ca-app-pub-6691965685689933/3105080728", new T6.a(aVar, 2));
        } else {
            aVar.invoke();
        }
    }

    public final void x(String str, boolean z8) {
        j.e(str, NotificationCompat.CATEGORY_MESSAGE);
        runOnUiThread(new v(3, this, str, z8));
    }
}
