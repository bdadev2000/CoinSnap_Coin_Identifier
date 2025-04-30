package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzaml implements zzalv {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzamk zzc;
    private final zzfu zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaml() {
        this(null);
    }

    private static float zzb(int i9) {
        if (i9 == 0) {
            return 0.05f;
        }
        if (i9 != 1) {
            return i9 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j7, List list, List list2) {
        int i9;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() == j7) {
                    return size;
                }
                if (((Long) list.get(size)).longValue() < j7) {
                    i9 = size + 1;
                    break;
                }
            } else {
                i9 = 0;
                break;
            }
        }
        list.add(i9, Long.valueOf(j7));
        if (i9 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i9 - 1));
        }
        list2.add(i9, arrayList);
        return i9;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        int i9 = zzgd.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zze(com.google.android.gms.internal.ads.zzfu r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.zzy(r8)
            if (r0 == 0) goto Ldd
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L73
        L10:
            java.lang.String r0 = r7.zzy(r8)
            if (r0 == 0) goto L0
            int r1 = r7.zzb()
            if (r1 == 0) goto L22
            char r1 = r7.zza(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxm.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = r5
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L66
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzg = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L66:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzf = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L73:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L83:
            java.lang.String r4 = r7.zzy(r8)
            if (r4 == 0) goto Lc2
            int r5 = r7.zzb()
            if (r5 == 0) goto L95
            char r5 = r7.zza(r8)
            if (r5 == r2) goto Lc2
        L95:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La2
            com.google.android.gms.internal.ads.zzamm r1 = com.google.android.gms.internal.ads.zzamm.zza(r4)
            goto L83
        La2:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L83
            if (r1 != 0) goto Lb6
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzfk.zzf(r3, r4)
            goto L83
        Lb6:
            com.google.android.gms.internal.ads.zzamo r4 = com.google.android.gms.internal.ads.zzamo.zzb(r4, r1)
            if (r4 == 0) goto L83
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L83
        Lc2:
            r6.zze = r0
            goto L0
        Lc6:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld5
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzfk.zze(r3, r0)
            goto L0
        Ld5:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zze(com.google.android.gms.internal.ads.zzfu, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x01f5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    @Override // com.google.android.gms.internal.ads.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzalu r26, com.google.android.gms.internal.ads.zzev r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zza(byte[], int, int, com.google.android.gms.internal.ads.zzalu, com.google.android.gms.internal.ads.zzev):void");
    }

    public zzaml(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzfu();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzA = zzgd.zzA((byte[]) list.get(0));
        zzeq.zzd(zzA.startsWith("Format:"));
        zzamk zza2 = zzamk.zza(zzA);
        zza2.getClass();
        this.zzc = zza2;
        zze(new zzfu((byte[]) list.get(1)), zzfxs.zzc);
    }
}
