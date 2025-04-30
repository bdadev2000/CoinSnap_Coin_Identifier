package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
final class vk {

    /* renamed from: a, reason: collision with root package name */
    public final int f11758a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11761e;

    private vk(int i9, int i10, int i11, int i12, int i13) {
        this.f11758a = i9;
        this.b = i10;
        this.f11759c = i11;
        this.f11760d = i12;
        this.f11761e = i13;
    }

    public static vk a(String str) {
        char c9;
        AbstractC0669a1.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String lowerCase = Ascii.toLowerCase(split[i13].trim());
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals(TtmlNode.END)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals(MimeTypes.BASE_TYPE_TEXT)) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (lowerCase.equals(TtmlNode.TAG_STYLE)) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    i10 = i13;
                    break;
                case 1:
                    i12 = i13;
                    break;
                case 2:
                    i9 = i13;
                    break;
                case 3:
                    i11 = i13;
                    break;
            }
        }
        if (i9 != -1 && i10 != -1 && i12 != -1) {
            return new vk(i9, i10, i11, i12, split.length);
        }
        return null;
    }
}
