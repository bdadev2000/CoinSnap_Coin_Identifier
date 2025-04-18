package com.plantcare.ai.identifier.plantid.ui.component.ring;

import android.annotation.SuppressLint;
import android.os.PowerManager;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.y0;
import com.bumptech.glide.e;
import com.facebook.internal.i;
import com.plantcare.ai.identifier.plantid.R;
import kf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import pf.f;
import ug.b;
import vf.c;
import vf.d;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/ring/NotifyFullScreenActivity;", "Lmf/a;", "Lkf/y;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NewApi"})
@SourceDebugExtension({"SMAP\nNotifyFullScreenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyFullScreenActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/ring/NotifyFullScreenActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,90:1\n75#2,13:91\n*S KotlinDebug\n*F\n+ 1 NotifyFullScreenActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/ring/NotifyFullScreenActivity\n*L\n27#1:91,13\n*E\n"})
/* loaded from: classes4.dex */
public final class NotifyFullScreenActivity extends f {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f16716k = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16717j;

    public NotifyFullScreenActivity() {
        super(12);
        this.f16717j = new y0(Reflection.getOrCreateKotlinClass(NotifyViewModel.class), new c(this, 21), new c(this, 20), new d(this, 10));
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_notify_full_screen;
    }

    @Override // mf.a
    public final void q() {
        Object systemService = getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        ((PowerManager) systemService).newWakeLock(268435466, "NotifyFullScreen::WakeLock").acquire(3000L);
        getWindow().addFlags(6815872);
    }

    @Override // mf.a
    public final void r() {
        BuildersKt__Builders_commonKt.launch$default(i.v(this), null, null, new b(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(i.v(this), null, null, new ug.d(this, null), 3, null);
    }

    @Override // mf.a
    public final void s() {
        AppCompatButton btnGrowUp = ((y) n()).f20929t;
        Intrinsics.checkNotNullExpressionValue(btnGrowUp, "btnGrowUp");
        e.p(btnGrowUp, new p0(this, 14));
    }
}
