package com.plantcare.ai.identifier.plantid.ui.component.splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.lifecycle.y0;
import c3.j;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import d3.g;
import hf.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pf.f;
import s7.i0;
import vf.c;
import vf.d;
import wg.a;
import x5.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/splash/SplashActivity;", "Lmf/a;", "Lkf/s0;", "Lhf/e;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"CustomSplashScreen"})
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/splash/SplashActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 EasyPreferences.kt\ncom/plantcare/ai/identifier/plantid/utils/EasyPreferences\n*L\n1#1,386:1\n75#2,13:387\n49#3,7:400\n49#3,7:407\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/splash/SplashActivity\n*L\n67#1:387,13\n86#1:400,7\n102#1:407,7\n*E\n"})
/* loaded from: classes4.dex */
public final class SplashActivity extends f implements e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16739n = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16740j;

    /* renamed from: k, reason: collision with root package name */
    public i0 f16741k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16742l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f16743m;

    public SplashActivity() {
        super(14);
        this.f16740j = new y0(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new c(this, 25), new c(this, 24), new d(this, 12));
        this.f16743m = Uri.parse("asset:///splash_plant.mp4");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00eb A[Catch: Exception -> 0x00fa, TryCatch #3 {Exception -> 0x00fa, blocks: (B:100:0x00e6, B:106:0x00eb, B:108:0x00ef, B:109:0x00f3), top: B:99:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194 A[Catch: Exception -> 0x01a4, TryCatch #6 {Exception -> 0x01a4, blocks: (B:28:0x018f, B:61:0x0194, B:63:0x0198, B:64:0x019d), top: B:27:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ac A[Catch: Exception -> 0x00bb, TryCatch #1 {Exception -> 0x00bb, blocks: (B:82:0x00a7, B:88:0x00ac, B:90:0x00b0, B:91:0x00b4), top: B:81:0x00a7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity r11) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity.I(com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity):void");
    }

    public final void J() {
        if (i.l()) {
            g3.c.a().f18018m = true;
            w5.d.g(this);
            finish();
        } else {
            g3.c.a().f18018m = false;
            Intrinsics.checkNotNullParameter(this, "fromActivity");
            Intent intent = new Intent(this, (Class<?>) LanguageActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("key_tracking_screen_from", "SplashActivity");
            startActivity(intent);
            finish();
        }
        Log.d("duylt", "Type Sub Move: " + i.f());
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_splash;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!i.l()) {
            g r6 = g.r();
            a aVar = new a(this, 1);
            r6.getClass();
            j b3 = j.b();
            b3.getClass();
            new Handler(getMainLooper()).postDelayed(new k0.a(8, b3, this, aVar), 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0497  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity.q():void");
    }
}
