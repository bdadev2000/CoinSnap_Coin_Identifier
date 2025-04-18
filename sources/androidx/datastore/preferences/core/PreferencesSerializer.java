package androidx.datastore.preferences.core;

import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import e0.e0;
import e0.u;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import p0.a;

/* loaded from: classes3.dex */
public final class PreferencesSerializer implements Serializer<Preferences> {

    /* renamed from: a, reason: collision with root package name */
    public static final PreferencesSerializer f19100a = new Object();

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19101a;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f19101a = iArr;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final MutablePreferences a() {
        return new MutablePreferences(true);
    }

    @Override // androidx.datastore.core.Serializer
    public final MutablePreferences b(FileInputStream fileInputStream) {
        try {
            PreferencesProto.PreferenceMap w = PreferencesProto.PreferenceMap.w(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(false);
            Preferences.Pair[] pairArr = (Preferences.Pair[]) Arrays.copyOf(new Preferences.Pair[0], 0);
            a.s(pairArr, "pairs");
            mutablePreferences.c();
            if (pairArr.length > 0) {
                pairArr[0].getClass();
                mutablePreferences.d(null, null);
                throw null;
            }
            Map u2 = w.u();
            a.r(u2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : u2.entrySet()) {
                String str = (String) entry.getKey();
                PreferencesProto.Value value = (PreferencesProto.Value) entry.getValue();
                a.r(str, "name");
                a.r(value, "value");
                PreferencesProto.Value.ValueCase I = value.I();
                switch (I == null ? -1 : WhenMappings.f19101a[I.ordinal()]) {
                    case -1:
                        throw new IOException("Value case is null.", null);
                    case 0:
                    default:
                        throw new RuntimeException();
                    case 1:
                        mutablePreferences.d(new Preferences.Key(str), Boolean.valueOf(value.A()));
                        break;
                    case 2:
                        mutablePreferences.d(new Preferences.Key(str), Float.valueOf(value.D()));
                        break;
                    case 3:
                        mutablePreferences.d(new Preferences.Key(str), Double.valueOf(value.C()));
                        break;
                    case 4:
                        mutablePreferences.d(new Preferences.Key(str), Integer.valueOf(value.E()));
                        break;
                    case 5:
                        mutablePreferences.d(new Preferences.Key(str), Long.valueOf(value.F()));
                        break;
                    case 6:
                        Preferences.Key key = new Preferences.Key(str);
                        String G = value.G();
                        a.r(G, "value.string");
                        mutablePreferences.d(key, G);
                        break;
                    case 7:
                        Preferences.Key key2 = new Preferences.Key(str);
                        Internal.ProtobufList v2 = value.H().v();
                        a.r(v2, "value.stringSet.stringsList");
                        mutablePreferences.d(key2, u.e1(v2));
                        break;
                    case 8:
                        throw new IOException("Value not set.", null);
                }
            }
            return new MutablePreferences(e0.z(mutablePreferences.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new IOException("Unable to parse preferences proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final void c(Object obj, OutputStream outputStream) {
        GeneratedMessageLite k2;
        Map a2 = ((Preferences) obj).a();
        PreferencesProto.PreferenceMap.Builder v2 = PreferencesProto.PreferenceMap.v();
        for (Map.Entry entry : a2.entrySet()) {
            Preferences.Key key = (Preferences.Key) entry.getKey();
            Object value = entry.getValue();
            String str = key.f19096a;
            if (value instanceof Boolean) {
                PreferencesProto.Value.Builder J = PreferencesProto.Value.J();
                boolean booleanValue = ((Boolean) value).booleanValue();
                J.m();
                PreferencesProto.Value.x((PreferencesProto.Value) J.f19239b, booleanValue);
                k2 = J.k();
            } else if (value instanceof Float) {
                PreferencesProto.Value.Builder J2 = PreferencesProto.Value.J();
                float floatValue = ((Number) value).floatValue();
                J2.m();
                PreferencesProto.Value.y((PreferencesProto.Value) J2.f19239b, floatValue);
                k2 = J2.k();
            } else if (value instanceof Double) {
                PreferencesProto.Value.Builder J3 = PreferencesProto.Value.J();
                double doubleValue = ((Number) value).doubleValue();
                J3.m();
                PreferencesProto.Value.w((PreferencesProto.Value) J3.f19239b, doubleValue);
                k2 = J3.k();
            } else if (value instanceof Integer) {
                PreferencesProto.Value.Builder J4 = PreferencesProto.Value.J();
                int intValue = ((Number) value).intValue();
                J4.m();
                PreferencesProto.Value.z((PreferencesProto.Value) J4.f19239b, intValue);
                k2 = J4.k();
            } else if (value instanceof Long) {
                PreferencesProto.Value.Builder J5 = PreferencesProto.Value.J();
                long longValue = ((Number) value).longValue();
                J5.m();
                PreferencesProto.Value.t((PreferencesProto.Value) J5.f19239b, longValue);
                k2 = J5.k();
            } else if (value instanceof String) {
                PreferencesProto.Value.Builder J6 = PreferencesProto.Value.J();
                J6.m();
                PreferencesProto.Value.u((PreferencesProto.Value) J6.f19239b, (String) value);
                k2 = J6.k();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(a.z0(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                PreferencesProto.Value.Builder J7 = PreferencesProto.Value.J();
                PreferencesProto.StringSet.Builder w = PreferencesProto.StringSet.w();
                w.m();
                PreferencesProto.StringSet.t((PreferencesProto.StringSet) w.f19239b, (Set) value);
                J7.m();
                PreferencesProto.Value.v((PreferencesProto.Value) J7.f19239b, w);
                k2 = J7.k();
            }
            v2.getClass();
            str.getClass();
            v2.m();
            PreferencesProto.PreferenceMap.t((PreferencesProto.PreferenceMap) v2.f19239b).put(str, (PreferencesProto.Value) k2);
        }
        ((PreferencesProto.PreferenceMap) v2.k()).l(outputStream);
    }
}
