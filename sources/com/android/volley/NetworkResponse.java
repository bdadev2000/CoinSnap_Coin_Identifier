package com.android.volley;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class NetworkResponse {

    @Nullable
    public final List<Header> allHeaders;
    public final byte[] data;

    @Nullable
    public final Map<String, String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    @Deprecated
    public NetworkResponse(int i2, byte[] bArr, @Nullable Map<String, String> map, boolean z2, long j2) {
        this(i2, bArr, map, toAllHeaderList(map), z2, j2);
    }

    @Nullable
    private static List<Header> toAllHeaderList(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    private static Map<String, String> toHeaderMap(@Nullable List<Header> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    public NetworkResponse(int i2, byte[] bArr, boolean z2, long j2, @Nullable List<Header> list) {
        this(i2, bArr, toHeaderMap(list), list, z2, j2);
    }

    @Deprecated
    public NetworkResponse(int i2, byte[] bArr, @Nullable Map<String, String> map, boolean z2) {
        this(i2, bArr, map, z2, 0L);
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0L, (List<Header>) Collections.emptyList());
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, @Nullable Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private NetworkResponse(int i2, byte[] bArr, @Nullable Map<String, String> map, @Nullable List<Header> list, boolean z2, long j2) {
        this.statusCode = i2;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z2;
        this.networkTimeMs = j2;
    }
}
