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

/* renamed from: com.applovin.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0724m1 f8888c = new C0724m1(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    private static final C0724m1 f8889d = new C0724m1(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f8890e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f8891a;
    private final int b;

    /* renamed from: com.applovin.impl.m1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            ab.a f9 = ab.f();
            for (int i9 : C0724m1.f8890e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i9).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    f9.b(Integer.valueOf(i9));
                }
            }
            f9.b(2);
            return pb.a(f9.a());
        }
    }

    public C0724m1(int[] iArr, int i9) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8891a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f8891a = new int[0];
        }
        this.b = i9;
    }

    public static C0724m1 a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static boolean b() {
        if (yp.f12451a >= 17) {
            String str = yp.f12452c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724m1)) {
            return false;
        }
        C0724m1 c0724m1 = (C0724m1) obj;
        if (Arrays.equals(this.f8891a, c0724m1.f8891a) && this.b == c0724m1.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f8891a) * 31) + this.b;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.f8891a) + "]";
    }

    public boolean a(int i9) {
        return Arrays.binarySearch(this.f8891a, i9) >= 0;
    }

    public static C0724m1 a(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f8889d;
        }
        if (yp.f12451a >= 29 && yp.d(context)) {
            return new C0724m1(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new C0724m1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f8888c;
    }
}
