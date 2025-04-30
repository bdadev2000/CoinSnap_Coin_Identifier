package Q7;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.C0435j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n0 {
    public static final void a(int i9, View view, ViewGroup viewGroup) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        G7.j.e(viewGroup, "container");
        int d2 = AbstractC2965e.d(i9);
        ViewGroup viewGroup2 = null;
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 != 2) {
                    if (d2 == 3) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
            }
            viewGroup2.removeView(view);
        }
    }

    public static final boolean b(int i9) {
        if (i9 != 3 && i9 != 4 && i9 != 6) {
            return false;
        }
        return true;
    }

    public static int c(int i9, int i10, int i11, int i12) {
        return C0435j.M(i9) + i10 + i11 + i12;
    }

    public static Object d(com.applovin.impl.sdk.k kVar, String str) {
        return kVar.g0().getExtraParameters().get(str);
    }

    public static String e(int i9, int i10, String str, String str2) {
        return str + i9 + str2 + i10;
    }

    public static String f(int i9, String str, String str2) {
        return str + i9 + str2;
    }

    public static String g(long j7, String str) {
        return str + j7;
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String i(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, long j7, String str) {
        sb.append(j7);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String n(StringBuilder sb, boolean z8, char c9) {
        sb.append(z8);
        sb.append(c9);
        return sb.toString();
    }

    public static StringBuilder o(int i9, int i10, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i9);
        sb.append(str2);
        sb.append(i10);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder p(int i9, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i9);
        sb.append(str2);
        return sb;
    }

    public static Map q() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static /* synthetic */ void r(Object obj) {
        throw new ClassCastException();
    }

    public static void s(String str, String str2, com.applovin.impl.sdk.t tVar, String str3) {
        tVar.a(str3, str + str2);
    }

    public static void t(StringBuilder sb, int i9, String str, int i10, String str2) {
        sb.append(i9);
        sb.append(str);
        sb.append(i10);
        sb.append(str2);
    }

    public static boolean u(d8.b bVar, String str, c8.g gVar, String str2, c8.g gVar2) {
        G7.j.e(bVar, str);
        G7.j.e(gVar, str2);
        return bVar.o(gVar2);
    }

    public static int v(int i9, int i10, int i11, int i12) {
        return ((i9 * i10) / i11) + i12;
    }

    public static /* synthetic */ String w(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String x(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String y(int i9) {
        switch (i9) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i9) {
        switch (i9) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
