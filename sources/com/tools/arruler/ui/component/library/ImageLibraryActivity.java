package com.tools.arruler.ui.component.library;

import E6.b;
import F1.i;
import F2.d;
import F2.h;
import F7.l;
import G7.s;
import I6.e;
import N6.f;
import N6.j;
import Q7.AbstractC0255x;
import T.H0;
import T.K0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C0462f0;
import androidx.lifecycle.V;
import androidx.lifecycle.d0;
import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import h.c;
import k.C2426o;
import o7.C2513b;
import p1.C2538b;
import q7.InterfaceC2649b;
import t7.y;
import u6.AbstractC2795k;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class ImageLibraryActivity extends AbstractActivityC2926b implements InterfaceC2649b {
    public static final /* synthetic */ int l = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19670f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19671g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19672h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19673i = false;

    /* renamed from: j, reason: collision with root package name */
    public final i f19674j;

    /* renamed from: k, reason: collision with root package name */
    public final c f19675k;

    public ImageLibraryActivity() {
        addOnContextAvailableListener(new b(this, 3));
        this.f19674j = new i(s.a(j.class), new e(this, 4), new e(this, 3), new e(this, 5));
        this.f19675k = registerForActivityResult(new C0462f0(3), new d(this, 2));
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return t().a();
    }

    @Override // f.l
    public final d0 getDefaultViewModelProviderFactory() {
        return h.m(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_image_library;
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = t().c();
            this.f19670f = c9;
            if (c9.a()) {
                this.f19670f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2426o c2426o = this.f19670f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (q6.c.f22801e.a().i() && a.v(this) && !C2538b.a().m) {
            r6.h.f22921e.i().b(this, "ca-app-pub-6691965685689933/7966648879", false);
            return;
        }
        FrameLayout frameLayout = ((AbstractC2795k) k()).f23339s;
        G7.j.d(frameLayout, "frAds");
        com.bumptech.glide.d.M(frameLayout);
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        Group group = ((AbstractC2795k) k()).f23340t;
        G7.j.d(group, "groupData");
        group.setVisibility(8);
        Group group2 = ((AbstractC2795k) k()).f23341u;
        G7.j.d(group2, "groupNoData");
        group2.setVisibility(8);
        AbstractC2795k abstractC2795k = (AbstractC2795k) k();
        AppCompatEditText appCompatEditText = ((AbstractC2795k) k()).f23337q;
        G7.j.d(appCompatEditText, "edtSearch");
        h.w(abstractC2795k.f19787f, this, appCompatEditText);
        ((AbstractC2795k) k()).f19787f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: N6.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i9 = ImageLibraryActivity.l;
                ImageLibraryActivity imageLibraryActivity = ImageLibraryActivity.this;
                G7.j.e(imageLibraryActivity, "this$0");
                Rect rect = new Rect();
                ((AbstractC2795k) imageLibraryActivity.k()).f19787f.getWindowVisibleDisplayFrame(rect);
                int height = ((AbstractC2795k) imageLibraryActivity.k()).f19787f.getRootView().getHeight();
                int i10 = height - rect.bottom;
                Log.d("TAG", "keypadHeight = " + i10);
                if (i10 > height * 0.15d) {
                    ((AbstractC2795k) imageLibraryActivity.k()).f23337q.requestFocus();
                } else {
                    ((AbstractC2795k) imageLibraryActivity.k()).f23337q.clearFocus();
                }
            }
        });
    }

    @Override // x6.AbstractActivityC2926b
    public final void q() {
        O6.c cVar = new O6.c();
        final int i9 = 0;
        cVar.f2242j = new l(this) { // from class: N6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageLibraryActivity f2105c;

            {
                this.f2105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // F7.l
            public final Object invoke(Object obj) {
                H0 h02;
                WindowInsetsController insetsController;
                y yVar = y.f23029a;
                ImageLibraryActivity imageLibraryActivity = this.f2105c;
                InternalImageModel internalImageModel = (InternalImageModel) obj;
                switch (i9) {
                    case 0:
                        int i10 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        G7.j.e(internalImageModel, "it");
                        AppCompatEditText appCompatEditText = ((AbstractC2795k) imageLibraryActivity.k()).f23337q;
                        G7.j.d(appCompatEditText, "edtSearch");
                        Window window = imageLibraryActivity.getWindow();
                        E1.c cVar2 = new E1.c(appCompatEditText);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 30) {
                            insetsController = window.getInsetsController();
                            K0 k02 = new K0(insetsController, cVar2);
                            k02.f2868n = window;
                            h02 = k02;
                        } else if (i11 >= 26) {
                            h02 = new H0(window, cVar2);
                        } else {
                            h02 = new H0(window, cVar2);
                        }
                        h02.O(8);
                        appCompatEditText.clearFocus();
                        Intent intent = new Intent(imageLibraryActivity, (Class<?>) ImageDetailActivity.class);
                        intent.putExtra("extra_image_path", internalImageModel.getPath());
                        imageLibraryActivity.f19675k.a(intent);
                        return yVar;
                    default:
                        int i12 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        G7.j.e(internalImageModel, "internalImageModel");
                        new D6.c(imageLibraryActivity, new G6.g(imageLibraryActivity, internalImageModel, 1)).show();
                        return yVar;
                }
            }
        };
        final int i10 = 1;
        cVar.f2243k = new l(this) { // from class: N6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageLibraryActivity f2105c;

            {
                this.f2105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // F7.l
            public final Object invoke(Object obj) {
                H0 h02;
                WindowInsetsController insetsController;
                y yVar = y.f23029a;
                ImageLibraryActivity imageLibraryActivity = this.f2105c;
                InternalImageModel internalImageModel = (InternalImageModel) obj;
                switch (i10) {
                    case 0:
                        int i102 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        G7.j.e(internalImageModel, "it");
                        AppCompatEditText appCompatEditText = ((AbstractC2795k) imageLibraryActivity.k()).f23337q;
                        G7.j.d(appCompatEditText, "edtSearch");
                        Window window = imageLibraryActivity.getWindow();
                        E1.c cVar2 = new E1.c(appCompatEditText);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 30) {
                            insetsController = window.getInsetsController();
                            K0 k02 = new K0(insetsController, cVar2);
                            k02.f2868n = window;
                            h02 = k02;
                        } else if (i11 >= 26) {
                            h02 = new H0(window, cVar2);
                        } else {
                            h02 = new H0(window, cVar2);
                        }
                        h02.O(8);
                        appCompatEditText.clearFocus();
                        Intent intent = new Intent(imageLibraryActivity, (Class<?>) ImageDetailActivity.class);
                        intent.putExtra("extra_image_path", internalImageModel.getPath());
                        imageLibraryActivity.f19675k.a(intent);
                        return yVar;
                    default:
                        int i12 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        G7.j.e(internalImageModel, "internalImageModel");
                        new D6.c(imageLibraryActivity, new G6.g(imageLibraryActivity, internalImageModel, 1)).show();
                        return yVar;
                }
            }
        };
        ((AbstractC2795k) k()).f23345y.setAdapter(cVar);
        AbstractC0255x.l(V.f(this), null, null, new f(this, cVar, null), 3);
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2795k abstractC2795k = (AbstractC2795k) k();
        final int i9 = 0;
        abstractC2795k.f23342v.setOnClickListener(new View.OnClickListener(this) { // from class: N6.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageLibraryActivity f2106c;

            {
                this.f2106c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageLibraryActivity imageLibraryActivity = this.f2106c;
                switch (i9) {
                    case 0:
                        int i10 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        imageLibraryActivity.finish();
                        return;
                    case 1:
                        int i11 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.setText("");
                        new Handler(Looper.getMainLooper()).postDelayed(new D3.b(imageLibraryActivity, 3), 200L);
                        return;
                    default:
                        int i12 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.requestFocus();
                        return;
                }
            }
        });
        AbstractC2795k abstractC2795k2 = (AbstractC2795k) k();
        final int i10 = 1;
        abstractC2795k2.f23343w.setOnClickListener(new View.OnClickListener(this) { // from class: N6.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageLibraryActivity f2106c;

            {
                this.f2106c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageLibraryActivity imageLibraryActivity = this.f2106c;
                switch (i10) {
                    case 0:
                        int i102 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        imageLibraryActivity.finish();
                        return;
                    case 1:
                        int i11 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.setText("");
                        new Handler(Looper.getMainLooper()).postDelayed(new D3.b(imageLibraryActivity, 3), 200L);
                        return;
                    default:
                        int i12 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.requestFocus();
                        return;
                }
            }
        });
        AbstractC2795k abstractC2795k3 = (AbstractC2795k) k();
        final int i11 = 2;
        abstractC2795k3.f23337q.setOnClickListener(new View.OnClickListener(this) { // from class: N6.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageLibraryActivity f2106c;

            {
                this.f2106c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageLibraryActivity imageLibraryActivity = this.f2106c;
                switch (i11) {
                    case 0:
                        int i102 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        imageLibraryActivity.finish();
                        return;
                    case 1:
                        int i112 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.setText("");
                        new Handler(Looper.getMainLooper()).postDelayed(new D3.b(imageLibraryActivity, 3), 200L);
                        return;
                    default:
                        int i12 = ImageLibraryActivity.l;
                        G7.j.e(imageLibraryActivity, "this$0");
                        ((AbstractC2795k) imageLibraryActivity.k()).f23337q.requestFocus();
                        return;
                }
            }
        });
        AbstractC2795k abstractC2795k4 = (AbstractC2795k) k();
        abstractC2795k4.f23337q.setOnEditorActionListener(new J6.b(this, 1));
    }

    public final C2513b t() {
        if (this.f19671g == null) {
            synchronized (this.f19672h) {
                try {
                    if (this.f19671g == null) {
                        this.f19671g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19671g;
    }

    public final j u() {
        return (j) this.f19674j.getValue();
    }
}
