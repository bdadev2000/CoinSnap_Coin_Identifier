package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gl extends bk {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f4947q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f4948r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f4949o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f4950p;

    public gl() {
        super("SubripDecoder");
        this.f4949o = new StringBuilder();
        this.f4950p = new ArrayList();
    }

    private static long a(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (Long.parseLong((String) a1.a((Object) matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) a1.a((Object) matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (group != null ? Long.parseLong(group) * 3600000 : 0L);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float b(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private String a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f4948r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        String str;
        ArrayList arrayList = new ArrayList();
        mc mcVar = new mc();
        yg ygVar = new yg(bArr, i10);
        while (true) {
            String l10 = ygVar.l();
            int i11 = 0;
            if (l10 == null) {
                break;
            }
            if (l10.length() != 0) {
                try {
                    Integer.parseInt(l10);
                    String l11 = ygVar.l();
                    if (l11 == null) {
                        kc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f4947q.matcher(l11);
                    if (matcher.matches()) {
                        mcVar.a(a(matcher, 1));
                        mcVar.a(a(matcher, 6));
                        this.f4949o.setLength(0);
                        this.f4950p.clear();
                        for (String l12 = ygVar.l(); !TextUtils.isEmpty(l12); l12 = ygVar.l()) {
                            if (this.f4949o.length() > 0) {
                                this.f4949o.append("<br>");
                            }
                            this.f4949o.append(a(l12, this.f4950p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f4949o.toString());
                        while (true) {
                            if (i11 >= this.f4950p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f4950p.get(i11);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(z4.f9319s);
                    } else {
                        kc.d("SubripDecoder", "Skipping invalid timing: ".concat(l11));
                    }
                } catch (NumberFormatException unused) {
                    kc.d("SubripDecoder", "Skipping invalid index: ".concat(l10));
                }
            }
        }
        return new hl((z4[]) arrayList.toArray(new z4[0]), mcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private z4 a(Spanned spanned, String str) {
        char c10;
        char c11;
        z4.b a = new z4.b().a(spanned);
        if (str == null) {
            return a.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            a.b(0);
        } else if (c10 != 3 && c10 != 4 && c10 != 5) {
            a.b(1);
        } else {
            a.b(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            a.a(2);
        } else if (c11 != 3 && c11 != 4 && c11 != 5) {
            a.a(1);
        } else {
            a.a(0);
        }
        return a.b(b(a.d())).a(b(a.c()), 0).a();
    }
}
