package com.facebook.appevents;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import f2.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import n0.n1;

/* loaded from: classes3.dex */
public abstract class i {
    public static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final jd.b f10946b = new jd.b(0);

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (View view2 : SequencesKt.sequence(new n1(view, null))) {
            v0.a aVar = (v0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new v0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.a;
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (-1 < lastIndex) {
                a4.j.t(arrayList.get(lastIndex));
                throw null;
            }
        }
    }

    public static List b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R.string.txt_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.silent);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(R.string.voice_sound_1);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = context.getString(R.string.voice_sound_2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = context.getString(R.string.voice_sound_3);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = context.getString(R.string.voice_sound_4);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        String string7 = context.getString(R.string.voice_sound_5);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = context.getString(R.string.voice_sound_6);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = context.getString(R.string.voice_sound_7);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = context.getString(R.string.voice_sound_8);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = context.getString(R.string.voice_sound_9);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = context.getString(R.string.voice_sound_10);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        String string13 = context.getString(R.string.voice_sound_11);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = context.getString(R.string.voice_sound_12);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        String string15 = context.getString(R.string.voice_sound_13);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        String string16 = context.getString(R.string.voice_sound_14);
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        String string17 = context.getString(R.string.voice_sound_15);
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        String string18 = context.getString(R.string.voice_sound_16);
        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
        String string19 = context.getString(R.string.voice_sound_17);
        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
        String string20 = context.getString(R.string.voice_sound_18);
        Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
        String string21 = context.getString(R.string.voice_sound_19);
        Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
        String string22 = context.getString(R.string.voice_sound_20);
        Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
        return CollectionsKt.mutableListOf(new SoundDomain(0L, string, 0), new SoundDomain(1L, string2, -1), new SoundDomain(2L, string3, R.raw.voice_air_horn), new SoundDomain(3L, string4, R.raw.voice_alarm_clock), new SoundDomain(4L, string5, R.raw.voice_cal_ringtone_1), new SoundDomain(5L, string6, R.raw.voice_cell_ringtone_2), new SoundDomain(6L, string7, R.raw.voice_classic_alarm), new SoundDomain(7L, string8, R.raw.voice_discord_call), new SoundDomain(8L, string9, R.raw.voice_gentle_guitar), new SoundDomain(9L, string10, R.raw.voice_kalimba), new SoundDomain(10L, string11, R.raw.voice_marimba_ringtone_5), new SoundDomain(11L, string12, R.raw.voice_marimba_ringtone_9), new SoundDomain(12L, string13, R.raw.voice_original_phone_ringtone), new SoundDomain(13L, string14, R.raw.voice_ringtone), new SoundDomain(14L, string15, R.raw.voice_ringtone_2), new SoundDomain(15L, string16, R.raw.voice_ringtone_3), new SoundDomain(16L, string17, R.raw.voice_ringtone_6), new SoundDomain(17L, string18, R.raw.voice_ringtone_bubbly_bubbles), new SoundDomain(18L, string19, R.raw.voice_ringtone_for_mobile_phone_with_cheerful_mood), new SoundDomain(19L, string20, R.raw.voice_ringtone_jungle), new SoundDomain(20L, string21, R.raw.voice_rooster), new SoundDomain(21L, string22, R.raw.voice_sound_1));
    }

    public static final synchronized void e(b accessTokenAppIdPair, u appEvents) {
        synchronized (i.class) {
            if (m6.a.b(i.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                t F = g.F();
                F.a(accessTokenAppIdPair, appEvents.c());
                g.I(F);
            } catch (Throwable th2) {
                m6.a.a(i.class, th2);
            }
        }
    }

    public static final synchronized void f(kc.c eventsToPersist) {
        u uVar;
        synchronized (i.class) {
            if (m6.a.b(i.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                t F = g.F();
                for (b accessTokenAppIdPair : eventsToPersist.t()) {
                    synchronized (eventsToPersist) {
                        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                        uVar = (u) ((HashMap) eventsToPersist.f20640c).get(accessTokenAppIdPair);
                    }
                    if (uVar != null) {
                        F.a(accessTokenAppIdPair, uVar.c());
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                g.I(F);
            } catch (Throwable th2) {
                m6.a.a(i.class, th2);
            }
        }
    }

    public static void g(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d0.b(viewGroup, z10);
        } else if (a) {
            try {
                d0.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public abstract void c(Throwable th2);

    public abstract void d(s2.h hVar);
}
