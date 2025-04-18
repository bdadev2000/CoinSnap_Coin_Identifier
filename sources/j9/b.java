package j9;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public int f19823f;

    /* renamed from: h, reason: collision with root package name */
    public int f19825h;

    /* renamed from: o, reason: collision with root package name */
    public float f19832o;
    public String a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f19819b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f19820c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f19821d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f19822e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19824g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19826i = false;

    /* renamed from: j, reason: collision with root package name */
    public final int f19827j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f19828k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f19829l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f19830m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f19831n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f19833p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19834q = false;

    public static int a(int i10, String str, String str2, int i11) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
    }
}
