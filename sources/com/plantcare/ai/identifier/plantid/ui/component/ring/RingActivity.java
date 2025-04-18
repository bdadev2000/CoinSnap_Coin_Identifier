package com.plantcare.ai.identifier.plantid.ui.component.ring;

import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.widget.TextView;
import androidx.lifecycle.y0;
import com.ads.control.admob.AppOpenManager;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kf.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import of.b;
import pf.f;
import ug.i;
import ug.k;
import ug.n;
import vf.c;
import vf.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/ring/RingActivity;", "Lmf/a;", "Lkf/m0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RingActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/ring/RingActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,240:1\n75#2,13:241\n*S KotlinDebug\n*F\n+ 1 RingActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/ring/RingActivity\n*L\n44#1:241,13\n*E\n"})
/* loaded from: classes4.dex */
public final class RingActivity extends f {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f16724p = 0;

    /* renamed from: j, reason: collision with root package name */
    public MediaPlayer f16725j;

    /* renamed from: k, reason: collision with root package name */
    public Vibrator f16726k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f16727l;

    /* renamed from: m, reason: collision with root package name */
    public Job f16728m;

    /* renamed from: n, reason: collision with root package name */
    public AlarmEntity f16729n;

    /* renamed from: o, reason: collision with root package name */
    public final y0 f16730o;

    public RingActivity() {
        super(13);
        this.f16730o = new y0(Reflection.getOrCreateKotlinClass(RingViewModel.class), new c(this, 23), new c(this, 22), new d(this, 11));
    }

    public final RingViewModel I() {
        return (RingViewModel) this.f16730o.getValue();
    }

    public final void J(Uri uri, Integer num) {
        boolean z10;
        boolean z11 = false;
        if (uri != null && num == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uri == null && num != null) {
            z11 = true;
        }
        if (z10) {
            MediaPlayer create = MediaPlayer.create(this, R.raw.voice_gentle_guitar);
            create.setLooping(true);
            this.f16725j = create;
            create.start();
        }
        if (z11) {
            try {
                Intrinsics.checkNotNull(num);
                MediaPlayer create2 = MediaPlayer.create(this, num.intValue());
                create2.setLooping(true);
                this.f16725j = create2;
                create2.start();
            } catch (Exception unused) {
                MediaPlayer create3 = MediaPlayer.create(this, R.raw.voice_sound_1);
                create3.setLooping(true);
                this.f16725j = create3;
                create3.start();
            }
        }
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_ring;
    }

    @Override // h.m, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f16725j;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f16725j = null;
        Vibrator vibrator = this.f16726k;
        if (vibrator != null) {
            vibrator.cancel();
        }
        this.f16726k = null;
        Job job = this.f16728m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f16728m = null;
    }

    @Override // mf.a
    public final void q() {
        Job launch$default;
        Object systemService = getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        ((PowerManager) systemService).newWakeLock(268435466, "AlarmActivity::WakeLock").acquire(3000L);
        Object systemService2 = getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        this.f16726k = (Vibrator) systemService2;
        this.f16727l = RingtoneManager.getDefaultUri(2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("KEY_DATA_TO_RING_SCREEN");
            if (serializable != null) {
                RingViewModel I = I();
                BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new n(I, ((AlarmEntity) serializable).getId(), null), 3, null);
            } else {
                com.bumptech.glide.d.E(this, R.string.some_thing_went_wrong);
                onBackPressed();
            }
        } else {
            com.bumptech.glide.d.E(this, R.string.some_thing_went_wrong);
            onBackPressed();
        }
        AppOpenManager.f().f2914k = false;
        RingViewModel I2 = I();
        launch$default = BuildersKt__Builders_commonKt.launch$default(I2.f22242c, null, null, new k(I2, null), 3, null);
        this.f16728m = launch$default;
        getWindow().addFlags(6815872);
    }

    @Override // mf.a
    public final void r() {
        I().f16733f.observe(this, new b(11, new i(this, 0)));
        I().f16735h.observe(this, new b(11, new i(this, 1)));
    }

    @Override // mf.a
    public final void s() {
        TextView btnLetDoIt = ((m0) n()).f20825t;
        Intrinsics.checkNotNullExpressionValue(btnLetDoIt, "btnLetDoIt");
        e.p(btnLetDoIt, new i(this, 2));
        TextView btnSnooze = ((m0) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnSnooze, "btnSnooze");
        e.p(btnSnooze, new i(this, 3));
    }
}
