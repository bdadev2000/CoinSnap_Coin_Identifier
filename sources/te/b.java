package te;

import android.media.CamcorderProfile;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class b {
    public static final fe.c a = new fe.c(b.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25379b;

    static {
        HashMap hashMap = new HashMap();
        f25379b = hashMap;
        hashMap.put(new ze.b(176, 144), 2);
        hashMap.put(new ze.b(320, PsExtractor.VIDEO_STREAM_MASK), 7);
        hashMap.put(new ze.b(352, 288), 3);
        hashMap.put(new ze.b(720, 480), 4);
        hashMap.put(new ze.b(1280, 720), 5);
        hashMap.put(new ze.b(1920, 1080), 6);
        hashMap.put(new ze.b(3840, 2160), 8);
    }

    public static CamcorderProfile a(int i10, ze.b bVar) {
        long j3 = bVar.f28749b * bVar.f28750c;
        HashMap hashMap = f25379b;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a(j3));
        while (arrayList.size() > 0) {
            int intValue = ((Integer) hashMap.get((ze.b) arrayList.remove(0))).intValue();
            if (CamcorderProfile.hasProfile(i10, intValue)) {
                return CamcorderProfile.get(i10, intValue);
            }
        }
        return CamcorderProfile.get(i10, 0);
    }
}
