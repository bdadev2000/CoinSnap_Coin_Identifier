package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzamp implements zzalv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzfu zze = new zzfu();

    public static float zzb(int i9) {
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

    private static long zzc(Matcher matcher, int i9) {
        long j7;
        String group = matcher.group(i9 + 1);
        if (group != null) {
            j7 = Long.parseLong(group) * 3600000;
        } else {
            j7 = 0;
        }
        String group2 = matcher.group(i9 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j7;
        String group3 = matcher.group(i9 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i9 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0105. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        String str;
        char c9;
        char c10;
        int i11;
        zzei zzp;
        zzamp zzampVar = this;
        zzampVar.zze.zzI(bArr, i9 + i10);
        zzampVar.zze.zzK(i9);
        Charset zzB = zzampVar.zze.zzB();
        if (zzB == null) {
            zzB = zzfxs.zzc;
        }
        while (true) {
            String zzy = zzampVar.zze.zzy(zzB);
            if (zzy != null) {
                if (zzy.length() != 0) {
                    try {
                        Integer.parseInt(zzy);
                        String zzy2 = zzampVar.zze.zzy(zzB);
                        if (zzy2 == null) {
                            zzfk.zzf("SubripParser", "Unexpected end");
                            return;
                        }
                        Matcher matcher = zza.matcher(zzy2);
                        if (matcher.matches()) {
                            long zzc = zzc(matcher, 1);
                            long zzc2 = zzc(matcher, 6);
                            int i12 = 0;
                            zzampVar.zzc.setLength(0);
                            zzampVar.zzd.clear();
                            String zzy3 = zzampVar.zze.zzy(zzB);
                            while (!TextUtils.isEmpty(zzy3)) {
                                if (zzampVar.zzc.length() > 0) {
                                    zzampVar.zzc.append("<br>");
                                }
                                StringBuilder sb = zzampVar.zzc;
                                ArrayList arrayList = zzampVar.zzd;
                                String trim = zzy3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = zzb.matcher(trim);
                                int i13 = i12;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i13;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i13 += length;
                                }
                                sb.append(sb2.toString());
                                zzy3 = zzampVar.zze.zzy(zzB);
                                i12 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(zzampVar.zzc.toString());
                            int i14 = 0;
                            while (true) {
                                if (i14 < zzampVar.zzd.size()) {
                                    str = (String) zzampVar.zzd.get(i14);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i14++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            zzeg zzegVar = new zzeg();
                            zzegVar.zzl(fromHtml);
                            if (str == null) {
                                zzp = zzegVar.zzp();
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c9 = 0;
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
                                if (c9 != 0 && c9 != 1 && c9 != 2) {
                                    if (c9 != 3 && c9 != 4 && c9 != 5) {
                                        zzegVar.zzi(1);
                                    } else {
                                        zzegVar.zzi(2);
                                    }
                                } else {
                                    zzegVar.zzi(0);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        break;
                                }
                                c10 = 65535;
                                if (c10 != 0 && c10 != 1) {
                                    if (c10 != 2) {
                                        if (c10 != 3 && c10 != 4 && c10 != 5) {
                                            zzegVar.zzf(1);
                                        } else {
                                            zzegVar.zzf(0);
                                        }
                                        zzegVar.zzh(zzb(zzegVar.zzb()));
                                        zzegVar.zze(zzb(zzegVar.zza()), 0);
                                        zzp = zzegVar.zzp();
                                    } else {
                                        i11 = 2;
                                    }
                                } else {
                                    i11 = 2;
                                }
                                zzegVar.zzf(i11);
                                zzegVar.zzh(zzb(zzegVar.zzb()));
                                zzegVar.zze(zzb(zzegVar.zza()), 0);
                                zzp = zzegVar.zzp();
                            }
                            zzevVar.zza(new zzaln(zzgbc.zzn(zzp), zzc, zzc2 - zzc));
                        } else {
                            zzfk.zzf("SubripParser", "Skipping invalid timing: ".concat(zzy2));
                        }
                    } catch (NumberFormatException unused) {
                        zzfk.zzf("SubripParser", "Skipping invalid index: ".concat(zzy));
                    }
                }
                zzampVar = this;
            } else {
                return;
            }
        }
    }
}
