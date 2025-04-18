package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$InAppUpdate$updateLauncher$1 extends r implements l {
    public static final DashboardPageKt$InAppUpdate$updateLauncher$1 INSTANCE = new DashboardPageKt$InAppUpdate$updateLauncher$1();

    public DashboardPageKt$InAppUpdate$updateLauncher$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActivityResult) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull ActivityResult activityResult) {
        a.s(activityResult, "result");
        if (activityResult.f276a == -1) {
            Log.d("InAppUpdateManager", "Update successful!");
        } else {
            Log.e("InAppUpdateManager", "Update failed or was canceled!");
        }
    }
}
