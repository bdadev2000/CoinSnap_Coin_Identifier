package com.glority.android.deviceinsights.cpu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CPUInspector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"Lcom/glority/android/deviceinsights/cpu/CPUInspector;", "", "<init>", "()V", "queryBrand", "", "queryCoreCount", "", "getMaxCpuFreq", "core", "getMinCpuFreq", "getCurrentCpuFreq", "readFile", "path", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class CPUInspector {
    public static final CPUInspector INSTANCE = new CPUInspector();

    private CPUInspector() {
    }

    public final String queryBrand() {
        Object obj;
        List split$default;
        String str;
        String obj2;
        Iterator it = StringsKt.split$default((CharSequence) readFile("/proc/cpuinfo"), new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.startsWith$default((String) next, "Processor", false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        return (str2 == null || (split$default = StringsKt.split$default((CharSequence) str2, new String[]{":"}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt.getOrNull(split$default, 1)) == null || (obj2 = StringsKt.trim((CharSequence) str).toString()) == null) ? "N/A" : obj2;
    }

    public final int queryCoreCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public final String getMaxCpuFreq(int core) {
        return readFile("/sys/devices/system/cpu/cpu" + core + "/cpufreq/cpuinfo_max_freq");
    }

    public final String getMinCpuFreq(int core) {
        return readFile("/sys/devices/system/cpu/cpu" + core + "/cpufreq/cpuinfo_min_freq");
    }

    public final String getCurrentCpuFreq(int core) {
        return readFile("/sys/devices/system/cpu/cpu" + core + "/cpufreq/scaling_cur_freq");
    }

    private final String readFile(String path) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            try {
                String readLine = bufferedReader.readLine();
                Intrinsics.checkNotNullExpressionValue(readLine, "readLine(...)");
                String obj = StringsKt.trim((CharSequence) readLine).toString();
                CloseableKt.closeFinally(bufferedReader, null);
                return obj;
            } finally {
            }
        } catch (IOException unused) {
            return "N/A";
        }
    }
}
