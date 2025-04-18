package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
final class vk {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8537c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8538d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8539e;

    private vk(int i10, int i11, int i12, int i13, int i14) {
        this.a = i10;
        this.f8536b = i11;
        this.f8537c = i12;
        this.f8538d = i13;
        this.f8539e = i14;
    }

    public static vk a(String str) {
        char c10;
        a1.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String lowerCase = Ascii.toLowerCase(split[i14].trim());
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals(TtmlNode.END)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals(MimeTypes.BASE_TYPE_TEXT)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (lowerCase.equals(TtmlNode.TAG_STYLE)) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new vk(i10, i11, i12, i13, split.length);
        }
        return null;
    }
}
