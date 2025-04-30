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
    private static final Pattern f7923q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f7924r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f7925o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f7926p;

    public gl() {
        super("SubripDecoder");
        this.f7925o = new StringBuilder();
        this.f7926p = new ArrayList();
    }

    private static long a(Matcher matcher, int i9) {
        String group = matcher.group(i9 + 1);
        long parseLong = (Long.parseLong((String) AbstractC0669a1.a((Object) matcher.group(i9 + 3))) * 1000) + (Long.parseLong((String) AbstractC0669a1.a((Object) matcher.group(i9 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (group != null ? Long.parseLong(group) * 3600000 : 0L);
        String group2 = matcher.group(i9 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float b(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private String a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f7924r.matcher(trim);
        int i9 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i9;
            int length = group.length();
            sb.replace(start, start + length, "");
            i9 += length;
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        String str;
        ArrayList arrayList = new ArrayList();
        mc mcVar = new mc();
        yg ygVar = new yg(bArr, i9);
        while (true) {
            String l = ygVar.l();
            int i10 = 0;
            if (l == null) {
                break;
            }
            if (l.length() != 0) {
                try {
                    Integer.parseInt(l);
                    String l2 = ygVar.l();
                    if (l2 == null) {
                        kc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f7923q.matcher(l2);
                    if (!matcher.matches()) {
                        kc.d("SubripDecoder", "Skipping invalid timing: ".concat(l2));
                    } else {
                        mcVar.a(a(matcher, 1));
                        mcVar.a(a(matcher, 6));
                        this.f7925o.setLength(0);
                        this.f7926p.clear();
                        for (String l6 = ygVar.l(); !TextUtils.isEmpty(l6); l6 = ygVar.l()) {
                            if (this.f7925o.length() > 0) {
                                this.f7925o.append("<br>");
                            }
                            this.f7925o.append(a(l6, this.f7926p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f7925o.toString());
                        while (true) {
                            if (i10 >= this.f7926p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f7926p.get(i10);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i10++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(z4.f12503s);
                    }
                } catch (NumberFormatException unused) {
                    kc.d("SubripDecoder", "Skipping invalid index: ".concat(l));
                }
            }
        }
        return new hl((z4[]) arrayList.toArray(new z4[0]), mcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private z4 a(Spanned spanned, String str) {
        char c9;
        char c10;
        z4.b a6 = new z4.b().a(spanned);
        if (str == null) {
            return a6.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0 || c9 == 1 || c9 == 2) {
            a6.b(0);
        } else if (c9 != 3 && c9 != 4 && c9 != 5) {
            a6.b(1);
        } else {
            a6.b(2);
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
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 6;
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
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = 4;
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
            a6.a(2);
        } else if (c10 != 3 && c10 != 4 && c10 != 5) {
            a6.a(1);
        } else {
            a6.a(0);
        }
        return a6.b(b(a6.d())).a(b(a6.c()), 0).a();
    }
}
