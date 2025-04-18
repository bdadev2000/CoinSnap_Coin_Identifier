package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzalc implements zzaki {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzed zze = new zzed();

    public static float zzb(int i10) {
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

    private static long zzc(Matcher matcher, int i10) {
        long j3;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j3 = Long.parseLong(group) * 3600000;
        } else {
            j3 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j3;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0105. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        String str;
        char c10;
        char c11;
        int i12;
        zzct zzp;
        zzalc zzalcVar = this;
        zzalcVar.zze.zzJ(bArr, i10 + i11);
        zzalcVar.zze.zzL(i10);
        Charset zzC = zzalcVar.zze.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzz = zzalcVar.zze.zzz(zzC);
            if (zzz != null) {
                if (zzz.length() != 0) {
                    try {
                        Integer.parseInt(zzz);
                        String zzz2 = zzalcVar.zze.zzz(zzC);
                        if (zzz2 == null) {
                            zzdt.zzf("SubripParser", "Unexpected end");
                            return;
                        }
                        Matcher matcher = zza.matcher(zzz2);
                        if (matcher.matches()) {
                            long zzc = zzc(matcher, 1);
                            long zzc2 = zzc(matcher, 6);
                            int i13 = 0;
                            zzalcVar.zzc.setLength(0);
                            zzalcVar.zzd.clear();
                            String zzz3 = zzalcVar.zze.zzz(zzC);
                            while (!TextUtils.isEmpty(zzz3)) {
                                if (zzalcVar.zzc.length() > 0) {
                                    zzalcVar.zzc.append("<br>");
                                }
                                StringBuilder sb2 = zzalcVar.zzc;
                                ArrayList arrayList = zzalcVar.zzd;
                                String trim = zzz3.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = zzb.matcher(trim);
                                int i14 = i13;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i14;
                                    int length = group.length();
                                    sb3.replace(start, start + length, "");
                                    i14 += length;
                                }
                                sb2.append(sb3.toString());
                                zzz3 = zzalcVar.zze.zzz(zzC);
                                i13 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(zzalcVar.zzc.toString());
                            int i15 = 0;
                            while (true) {
                                if (i15 < zzalcVar.zzd.size()) {
                                    str = (String) zzalcVar.zzd.get(i15);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i15++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            zzcr zzcrVar = new zzcr();
                            zzcrVar.zzl(fromHtml);
                            if (str == null) {
                                zzp = zzcrVar.zzp();
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
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
                                if (c10 != 0 && c10 != 1 && c10 != 2) {
                                    if (c10 != 3 && c10 != 4 && c10 != 5) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(2);
                                    }
                                } else {
                                    zzcrVar.zzi(0);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        break;
                                }
                                c11 = 65535;
                                if (c11 != 0 && c11 != 1) {
                                    if (c11 != 2) {
                                        if (c11 != 3 && c11 != 4 && c11 != 5) {
                                            zzcrVar.zzf(1);
                                        } else {
                                            zzcrVar.zzf(0);
                                        }
                                        zzcrVar.zzh(zzb(zzcrVar.zzb()));
                                        zzcrVar.zze(zzb(zzcrVar.zza()), 0);
                                        zzp = zzcrVar.zzp();
                                    } else {
                                        i12 = 2;
                                    }
                                } else {
                                    i12 = 2;
                                }
                                zzcrVar.zzf(i12);
                                zzcrVar.zzh(zzb(zzcrVar.zzb()));
                                zzcrVar.zze(zzb(zzcrVar.zza()), 0);
                                zzp = zzcrVar.zzp();
                            }
                            zzdgVar.zza(new zzaka(zzfzo.zzo(zzp), zzc, zzc2 - zzc));
                        } else {
                            zzdt.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                        }
                    } catch (NumberFormatException unused) {
                        zzdt.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                    }
                }
                zzalcVar = this;
            } else {
                return;
            }
        }
    }
}
