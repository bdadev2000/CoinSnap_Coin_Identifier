package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
final class zzagq {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzagm zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagq.zza(java.lang.String):com.google.android.gms.internal.ads.zzagm");
    }

    private static zzgbc zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j7;
        long j9;
        zzgaz zzgazVar = new zzgaz();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzge.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzge.zza(xmlPullParser, concat2);
                String zza3 = zzge.zza(xmlPullParser, concat3);
                String zza4 = zzge.zza(xmlPullParser, concat4);
                String zza5 = zzge.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    if (zza4 != null) {
                        j7 = Long.parseLong(zza4);
                    } else {
                        j7 = 0;
                    }
                    if (zza5 != null) {
                        j9 = Long.parseLong(zza5);
                    } else {
                        j9 = 0;
                    }
                    zzgazVar.zzf(new zzagl(zza2, zza3, j7, j9));
                } else {
                    return zzgbc.zzm();
                }
            }
        } while (!zzge.zzb(xmlPullParser, str.concat(":Directory")));
        return zzgazVar.zzi();
    }
}
