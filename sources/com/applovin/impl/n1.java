package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.impl.eb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f25625c = new n1(new int[]{2}, 8);
    private static final n1 d = new n1(new int[]{2, 5, 6}, 8);
    private static final int[] e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f25626a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25627b;

    /* loaded from: classes.dex */
    public static final class a {
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            eb.a f2 = eb.f();
            for (int i2 : n1.e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    f2.b(Integer.valueOf(i2));
                }
            }
            f2.b(2);
            return ub.a(f2.a());
        }
    }

    public n1(int[] iArr, int i2) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25626a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f25626a = new int[0];
        }
        this.f25627b = i2;
    }

    private static boolean b() {
        if (xp.f27962a >= 17) {
            String str = xp.f27964c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return this.f25627b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Arrays.equals(this.f25626a, n1Var.f25626a) && this.f25627b == n1Var.f25627b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f25626a) * 31) + this.f25627b;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f25627b + ", supportedEncodings=" + Arrays.toString(this.f25626a) + "]";
    }

    public static n1 a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean a(int i2) {
        return Arrays.binarySearch(this.f25626a, i2) >= 0;
    }

    public static n1 a(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (xp.f27962a < 29 || !xp.d(context)) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f25625c : new n1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new n1(a.a(), 8);
    }
}
