package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.impl.ab;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f5938c = new m1(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    private static final m1 f5939d = new m1(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f5940e = {5, 6, 18, 17, 14, 7, 8};
    private final int[] a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5941b;

    /* loaded from: classes.dex */
    public static final class a {
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            ab.a f10 = ab.f();
            for (int i10 : m1.f5940e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    f10.b(Integer.valueOf(i10));
                }
            }
            f10.b(2);
            return pb.a(f10.a());
        }
    }

    public m1(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.f5941b = i10;
    }

    public static m1 a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static boolean b() {
        if (yp.a >= 17) {
            String str = yp.f9254c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return this.f5941b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (Arrays.equals(this.a, m1Var.a) && this.f5941b == m1Var.f5941b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.f5941b;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f5941b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.a, i10) >= 0;
    }

    public static m1 a(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f5939d;
        }
        if (yp.a >= 29 && yp.d(context)) {
            return new m1(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new m1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f5938c;
    }
}
