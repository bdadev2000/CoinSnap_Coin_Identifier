package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.y0;
import com.ads.control.admob.AppOpenManager;
import com.bumptech.glide.e;
import com.facebook.internal.i;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.otaliastudios.cameraview.CameraView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewIdentifyActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import ge.g;
import kf.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import n0.l1;
import ng.b;
import og.h;
import pf.f;
import sf.k;
import sf.l;
import vf.c;
import vf.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/camera/PlantIdentifierActivity;", "Lmf/a;", "Lkf/e0;", "<init>", "()V", "wh/a0", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlantIdentifierActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlantIdentifierActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/camera/PlantIdentifierActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,503:1\n75#2,13:504\n75#2,13:517\n*S KotlinDebug\n*F\n+ 1 PlantIdentifierActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/camera/PlantIdentifierActivity\n*L\n82#1:504,13\n83#1:517,13\n*E\n"})
/* loaded from: classes4.dex */
public final class PlantIdentifierActivity extends f {

    /* renamed from: q, reason: collision with root package name */
    public static Bitmap f16673q;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16674j;

    /* renamed from: k, reason: collision with root package name */
    public final y0 f16675k;

    /* renamed from: l, reason: collision with root package name */
    public k f16676l;

    /* renamed from: m, reason: collision with root package name */
    public RewardedAd f16677m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16678n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16679o;

    /* renamed from: p, reason: collision with root package name */
    public int f16680p;

    public PlantIdentifierActivity() {
        super(6);
        this.f16674j = new y0(Reflection.getOrCreateKotlinClass(PreviewModel.class), new c(this, 9), new c(this, 8), new d(this, 4));
        this.f16675k = new y0(Reflection.getOrCreateKotlinClass(PlantIdViewModel.class), new c(this, 11), new c(this, 10), new d(this, 5));
    }

    public static final void I(PlantIdentifierActivity plantIdentifierActivity) {
        plantIdentifierActivity.getClass();
        Intent intent = new Intent(plantIdentifierActivity, (Class<?>) PreviewIdentifyActivity.class);
        intent.putExtra("KEY_FLAG_ID_OR_DI", !((e0) plantIdentifierActivity.n()).C.isActivated() ? 1 : 0);
        plantIdentifierActivity.startActivity(intent);
    }

    public static final void J(PlantIdentifierActivity plantIdentifierActivity) {
        plantIdentifierActivity.getClass();
        AppOpenManager.f().f2914k = false;
        plantIdentifierActivity.f16678n = true;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", plantIdentifierActivity.getPackageName(), null));
        plantIdentifierActivity.startActivity(intent);
    }

    public final PlantIdViewModel K() {
        return (PlantIdViewModel) this.f16675k.getValue();
    }

    public final PreviewModel L() {
        return (PreviewModel) this.f16674j.getValue();
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_plant_identifier;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(i.v(this), Dispatchers.getIO(), null, new ng.f(this, null), 2, null);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        boolean z10;
        String[] strArr;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 555) {
            if (grantResults.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((!z10) && grantResults[0] == 0) {
                PreviewModel L = L();
                BuildersKt__Builders_commonKt.launch$default(L.f22242c, null, null, new h(L, null), 3, null);
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            } else {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            }
            Intrinsics.checkNotNullParameter(this, "activity");
            if (!androidx.core.app.i.b(this, strArr[0])) {
                String string = getString(R.string.read_external_storage_needed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = getString(R.string.des_storage_permission);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                new l(this, string, string2, new b(this, 6)).show();
            }
        }
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!x5.i.h(this)) {
            onBackPressed();
        }
        int i10 = 1;
        int i11 = 0;
        if (this.f16678n && !x5.i.l()) {
            if (x5.i.b()) {
                this.f16678n = true;
                AppOpenManager.f().f2914k = false;
            } else {
                AppOpenManager.f().f2914k = true;
                this.f16678n = false;
            }
        }
        if (x5.i.f() == 0) {
            LinearLayout layoutCountScan = ((e0) n()).D;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan, "layoutCountScan");
            e.D(layoutCountScan);
        } else if (x5.i.b() && x5.i.k()) {
            LinearLayout layoutCountScan2 = ((e0) n()).D;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan2, "layoutCountScan");
            e.V(layoutCountScan2);
            ((e0) n()).F.setText(String.valueOf(x5.i.d().f2795b));
            ((e0) n()).G.setText(String.valueOf(x5.i.d().a));
        } else if (hf.f.d()) {
            LinearLayout layoutCountScan3 = ((e0) n()).D;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan3, "layoutCountScan");
            e.V(layoutCountScan3);
            ((e0) n()).F.setText(String.valueOf(x5.i.d().f2795b));
            ((e0) n()).G.setText(String.valueOf(x5.i.d().a));
        } else {
            LinearLayout layoutCountScan4 = ((e0) n()).D;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan4, "layoutCountScan");
            e.D(layoutCountScan4);
        }
        if (x5.i.l()) {
            FrameLayout frAds = ((e0) n()).f20744z;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            e.D(frAds);
        }
        x5.i.c(new b(this, i11), new b(this, i10));
    }

    @Override // mf.a
    public final void q() {
        if (x5.i.l()) {
            FrameLayout frAds = ((e0) n()).f20744z;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            e.D(frAds);
        }
        this.f16676l = new k(this);
        CameraView cameraView = ((e0) n()).f20743y;
        cameraView.setLifecycleOwner(this);
        cameraView.setPictureSize(e.I(1920));
        cameraView.setPlaySounds(false);
        cameraView.setSoundEffectsEnabled(false);
        cameraView.setFlash(g.OFF);
        cameraView.setGrid(ge.h.OFF);
        cameraView.f16492t.add(new ng.c(this));
        this.f16680p = o().getInt("KEY_COUNT_STORAGE_PERMISSION_DENIED", 0);
        K().f16671d.postValue(Integer.valueOf(getIntent().getIntExtra("KEY_TAB_PLANT_SCAN", 0)));
        GlobalApp.f16595i = true;
    }

    @Override // mf.a
    public final void r() {
        L().f16693k.observe(this, new of.b(7, new ng.d(this, 0)));
        L().f16695m.observe(this, new of.b(7, new ng.d(this, 1)));
        K().f16672e.observe(this, new of.b(7, new ng.d(this, 2)));
    }

    @Override // mf.a
    public final void s() {
        ImageView imgTakePhoto = ((e0) n()).C;
        Intrinsics.checkNotNullExpressionValue(imgTakePhoto, "imgTakePhoto");
        e.p(imgTakePhoto, new ng.d(this, 3));
        LinearLayout layoutSnapTips = ((e0) n()).E;
        Intrinsics.checkNotNullExpressionValue(layoutSnapTips, "layoutSnapTips");
        e.p(layoutSnapTips, l1.f22316l);
        ImageView icBack = ((e0) n()).A;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new ng.d(this, 4));
        ImageView icFlash = ((e0) n()).B;
        Intrinsics.checkNotNullExpressionValue(icFlash, "icFlash");
        e.p(icFlash, new ng.d(this, 5));
        LinearLayout btnSnapTips = ((e0) n()).f20741w;
        Intrinsics.checkNotNullExpressionValue(btnSnapTips, "btnSnapTips");
        e.p(btnSnapTips, new ng.d(this, 6));
        LinearLayout btnAlbum = ((e0) n()).f20739t;
        Intrinsics.checkNotNullExpressionValue(btnAlbum, "btnAlbum");
        e.p(btnAlbum, new ng.d(this, 7));
        TextView btnUnderStand = ((e0) n()).f20742x;
        Intrinsics.checkNotNullExpressionValue(btnUnderStand, "btnUnderStand");
        e.p(btnUnderStand, new ng.d(this, 8));
        TextView btnIdentify = ((e0) n()).f20740v;
        Intrinsics.checkNotNullExpressionValue(btnIdentify, "btnIdentify");
        e.p(btnIdentify, new ng.d(this, 9));
        TextView btnDiagnose = ((e0) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnDiagnose, "btnDiagnose");
        e.p(btnDiagnose, new ng.d(this, 10));
    }
}
