package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes4.dex */
final class yk {

    /* renamed from: a, reason: collision with root package name */
    public final int f28213a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28215c;
    public final int d;
    public final int e;

    private yk(int i2, int i3, int i4, int i5, int i6) {
        this.f28213a = i2;
        this.f28214b = i3;
        this.f28215c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static yk a(String str) {
        char c2;
        b1.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String lowerCase = Ascii.toLowerCase(split[i6].trim());
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (lowerCase.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            switch (c2) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i2 = i6;
                    break;
                case 3:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new yk(i2, i3, i4, i5, split.length);
    }
}
