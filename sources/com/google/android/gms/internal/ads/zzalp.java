package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzalp implements zzakv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzek zze = new zzek();

    @VisibleForTesting
    public static float zzb(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i2 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i2 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i2 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0105. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        String str;
        char c2;
        char c3;
        int i4;
        zzdb zzp;
        zzalp zzalpVar = this;
        zzalpVar.zze.zzJ(bArr, i2 + i3);
        zzalpVar.zze.zzL(i2);
        Charset zzC = zzalpVar.zze.zzC();
        if (zzC == null) {
            zzC = zzfxo.zzc;
        }
        while (true) {
            String zzz = zzalpVar.zze.zzz(zzC);
            if (zzz == null) {
                return;
            }
            if (zzz.length() != 0) {
                try {
                    Integer.parseInt(zzz);
                    String zzz2 = zzalpVar.zze.zzz(zzC);
                    if (zzz2 == null) {
                        zzea.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzz2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        int i5 = 0;
                        zzalpVar.zzc.setLength(0);
                        zzalpVar.zzd.clear();
                        String zzz3 = zzalpVar.zze.zzz(zzC);
                        while (!TextUtils.isEmpty(zzz3)) {
                            if (zzalpVar.zzc.length() > 0) {
                                zzalpVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzalpVar.zzc;
                            ArrayList arrayList = zzalpVar.zzd;
                            String trim = zzz3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i6 = i5;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i6;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i6 += length;
                            }
                            sb.append(sb2.toString());
                            zzz3 = zzalpVar.zze.zzz(zzC);
                            i5 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(zzalpVar.zzc.toString());
                        int i7 = 0;
                        while (true) {
                            if (i7 < zzalpVar.zzd.size()) {
                                str = (String) zzalpVar.zzd.get(i7);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i7++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcz zzczVar = new zzcz();
                        zzczVar.zzl(fromHtml);
                        if (str == null) {
                            zzp = zzczVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0 || c2 == 1 || c2 == 2) {
                                zzczVar.zzi(0);
                            } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                zzczVar.zzi(2);
                            } else {
                                zzczVar.zzi(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c3 = 3;
                                        break;
                                    }
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c3 = 4;
                                        break;
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c3 = 5;
                                        break;
                                    }
                                    break;
                            }
                            c3 = 65535;
                            if (c3 == 0 || c3 == 1) {
                                i4 = 2;
                            } else if (c3 != 2) {
                                if (c3 == 3 || c3 == 4 || c3 == 5) {
                                    zzczVar.zzf(0);
                                } else {
                                    zzczVar.zzf(1);
                                }
                                zzczVar.zzh(zzb(zzczVar.zzb()));
                                zzczVar.zze(zzb(zzczVar.zza()), 0);
                                zzp = zzczVar.zzp();
                            } else {
                                i4 = 2;
                            }
                            zzczVar.zzf(i4);
                            zzczVar.zzh(zzb(zzczVar.zzb()));
                            zzczVar.zze(zzb(zzczVar.zza()), 0);
                            zzp = zzczVar.zzp();
                        }
                        zzdnVar.zza(new zzakn(zzgax.zzo(zzp), zzc, zzc2 - zzc));
                    } else {
                        zzea.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzea.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                }
            }
            zzalpVar = this;
        }
    }
}
