package com.tools.arruler.ui.component.imagedetail;

import E6.b;
import F1.i;
import F2.h;
import G7.j;
import G7.s;
import I6.d;
import I6.e;
import I6.g;
import Q7.AbstractC0255x;
import T7.p;
import T7.r;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.lifecycle.V;
import androidx.lifecycle.d0;
import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k.C2426o;
import o7.C2513b;
import q7.InterfaceC2649b;
import u6.AbstractC2793i;
import u7.AbstractC2818i;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class ImageDetailActivity extends AbstractActivityC2926b implements InterfaceC2649b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19658k = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19659f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19660g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19661h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19662i = false;

    /* renamed from: j, reason: collision with root package name */
    public final i f19663j;

    public ImageDetailActivity() {
        addOnContextAvailableListener(new b(this, 1));
        this.f19663j = new i(s.a(I6.i.class), new e(this, 1), new e(this, 0), new e(this, 2));
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
        return R.layout.activity_image_detail;
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = t().c();
            this.f19659f = c9;
            if (c9.a()) {
                this.f19659f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2426o c2426o = this.f19659f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        r rVar;
        Object value;
        I6.i u8 = u();
        String stringExtra = getIntent().getStringExtra("extra_image_path");
        do {
            rVar = u8.f1479d;
            value = rVar.getValue();
            ((g) value).getClass();
        } while (!rVar.b(value, new g(stringExtra)));
    }

    @Override // x6.AbstractActivityC2926b
    public final void q() {
        AbstractC0255x.l(V.f(this), null, null, new d(this, null), 3);
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2793i abstractC2793i = (AbstractC2793i) k();
        final int i9 = 0;
        abstractC2793i.f23324s.setOnClickListener(new View.OnClickListener(this) { // from class: I6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageDetailActivity f1468c;

            {
                this.f1468c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String W2;
                ImageDetailActivity imageDetailActivity = this.f1468c;
                switch (i9) {
                    case 0:
                        int i10 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str = ((g) imageDetailActivity.u().f1479d.getValue()).f1476a;
                        if (str == null) {
                            W2 = "";
                        } else {
                            W2 = D7.a.W(new File(str));
                        }
                        ArrayList arrayList = imageDetailActivity.u().f1478c;
                        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((InternalImageModel) it.next()).getName());
                        }
                        new J6.c(imageDetailActivity, W2, arrayList2, new C6.a(imageDetailActivity, 2)).show();
                        return;
                    case 1:
                        int i11 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        imageDetailActivity.finish();
                        return;
                    default:
                        int i12 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str2 = ((g) ((p) imageDetailActivity.u().f1480e.f21833c).getValue()).f1476a;
                        if (str2 != null) {
                            Uri uriForFile = FileProvider.getUriForFile(imageDetailActivity, "com.tools.arruler.photomeasure.camera.ruler.provider", new File(str2));
                            j.d(uriForFile, "getUriForFile(...)");
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.STREAM", uriForFile);
                            intent.setType("image/*");
                            intent.addFlags(1);
                            imageDetailActivity.startActivity(Intent.createChooser(intent, "Share image via"));
                            return;
                        }
                        return;
                }
            }
        });
        AbstractC2793i abstractC2793i2 = (AbstractC2793i) k();
        final int i10 = 1;
        abstractC2793i2.f23322q.setOnClickListener(new View.OnClickListener(this) { // from class: I6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageDetailActivity f1468c;

            {
                this.f1468c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String W2;
                ImageDetailActivity imageDetailActivity = this.f1468c;
                switch (i10) {
                    case 0:
                        int i102 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str = ((g) imageDetailActivity.u().f1479d.getValue()).f1476a;
                        if (str == null) {
                            W2 = "";
                        } else {
                            W2 = D7.a.W(new File(str));
                        }
                        ArrayList arrayList = imageDetailActivity.u().f1478c;
                        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((InternalImageModel) it.next()).getName());
                        }
                        new J6.c(imageDetailActivity, W2, arrayList2, new C6.a(imageDetailActivity, 2)).show();
                        return;
                    case 1:
                        int i11 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        imageDetailActivity.finish();
                        return;
                    default:
                        int i12 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str2 = ((g) ((p) imageDetailActivity.u().f1480e.f21833c).getValue()).f1476a;
                        if (str2 != null) {
                            Uri uriForFile = FileProvider.getUriForFile(imageDetailActivity, "com.tools.arruler.photomeasure.camera.ruler.provider", new File(str2));
                            j.d(uriForFile, "getUriForFile(...)");
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.STREAM", uriForFile);
                            intent.setType("image/*");
                            intent.addFlags(1);
                            imageDetailActivity.startActivity(Intent.createChooser(intent, "Share image via"));
                            return;
                        }
                        return;
                }
            }
        });
        AbstractC2793i abstractC2793i3 = (AbstractC2793i) k();
        final int i11 = 2;
        abstractC2793i3.f23325t.setOnClickListener(new View.OnClickListener(this) { // from class: I6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageDetailActivity f1468c;

            {
                this.f1468c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String W2;
                ImageDetailActivity imageDetailActivity = this.f1468c;
                switch (i11) {
                    case 0:
                        int i102 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str = ((g) imageDetailActivity.u().f1479d.getValue()).f1476a;
                        if (str == null) {
                            W2 = "";
                        } else {
                            W2 = D7.a.W(new File(str));
                        }
                        ArrayList arrayList = imageDetailActivity.u().f1478c;
                        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((InternalImageModel) it.next()).getName());
                        }
                        new J6.c(imageDetailActivity, W2, arrayList2, new C6.a(imageDetailActivity, 2)).show();
                        return;
                    case 1:
                        int i112 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        imageDetailActivity.finish();
                        return;
                    default:
                        int i12 = ImageDetailActivity.f19658k;
                        j.e(imageDetailActivity, "this$0");
                        String str2 = ((g) ((p) imageDetailActivity.u().f1480e.f21833c).getValue()).f1476a;
                        if (str2 != null) {
                            Uri uriForFile = FileProvider.getUriForFile(imageDetailActivity, "com.tools.arruler.photomeasure.camera.ruler.provider", new File(str2));
                            j.d(uriForFile, "getUriForFile(...)");
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.STREAM", uriForFile);
                            intent.setType("image/*");
                            intent.addFlags(1);
                            imageDetailActivity.startActivity(Intent.createChooser(intent, "Share image via"));
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final C2513b t() {
        if (this.f19660g == null) {
            synchronized (this.f19661h) {
                try {
                    if (this.f19660g == null) {
                        this.f19660g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19660g;
    }

    public final I6.i u() {
        return (I6.i) this.f19663j.getValue();
    }
}
