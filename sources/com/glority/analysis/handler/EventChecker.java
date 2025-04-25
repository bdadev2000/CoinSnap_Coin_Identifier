package com.glority.analysis.handler;

import android.os.Bundle;
import com.glority.analysis.InitAnalysis;
import com.glority.analysis.utils.AnalysisUtils;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.utils.data.PersistData;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.enums.ParamsType;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventChecker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012H\u0002J&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/glority/analysis/handler/EventChecker;", "", "()V", "value", "", "enableDataCollect", "getEnableDataCollect", "()Ljava/lang/Boolean;", "setEnableDataCollect", "(Ljava/lang/Boolean;)V", "checkName", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", "eventName", "", "checkParam", "eventConfig", "params", "Landroid/os/Bundle;", "", "checkParamValid", "it", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventParams;", "entry", "", "checkParamValue", "checkValid", "diffParamsInfo", "isInBackListEvents", "isRealtime", "paramTypeCorrect", "paramsType", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class EventChecker {
    public static final EventChecker INSTANCE = new EventChecker();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamsType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ParamsType.STRING.ordinal()] = 1;
            iArr[ParamsType.INT.ordinal()] = 2;
            iArr[ParamsType.FLOAT.ordinal()] = 3;
            iArr[ParamsType.DOUBLE.ordinal()] = 4;
        }
    }

    private EventChecker() {
    }

    public final Boolean getEnableDataCollect() {
        return (Boolean) PersistData.INSTANCE.get(PersistKey.ENABLE_DATA_COLLECT);
    }

    public final void setEnableDataCollect(Boolean bool) {
        PersistData.INSTANCE.set(PersistKey.ENABLE_DATA_COLLECT, bool);
    }

    public final boolean isRealtime(String eventName) {
        Object obj;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<EventConfig> eventsConfig = AnalysisUtils.INSTANCE.getEventsConfig();
        if (eventsConfig != null) {
            Iterator<T> it = eventsConfig.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((EventConfig) obj).getEventName(), eventName)) {
                    break;
                }
            }
            EventConfig eventConfig = (EventConfig) obj;
            if (eventConfig != null) {
                return eventConfig.getRealtime();
            }
        }
        return false;
    }

    public final boolean checkValid(String eventName, Bundle params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        EventConfig checkName = checkName(eventName);
        if (checkName != null) {
            return checkParam(checkName, params);
        }
        return true;
    }

    public final boolean checkValid(String eventName, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        EventConfig checkName = checkName(eventName);
        if (checkName != null) {
            return checkParam(checkName, params);
        }
        return true;
    }

    private final boolean checkParam(EventConfig eventConfig, Map<String, ? extends Object> params) {
        Set<Map.Entry<String, ? extends Object>> entrySet;
        Object obj;
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV)) {
            return true;
        }
        if (params != null && (entrySet = params.entrySet()) != null) {
            for (Map.Entry<String, ? extends Object> entry : entrySet) {
                Iterator<T> it = eventConfig.getEventParams().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (INSTANCE.checkParamValid((EventParams) obj, entry)) {
                        break;
                    }
                }
                if (((EventParams) obj) == null) {
                    return false;
                }
            }
        }
        int i = 0;
        for (EventParams eventParams : eventConfig.getEventParams()) {
            if ((params != null ? params.get(eventParams.getParamsName()) : null) != null) {
                i++;
            } else if (eventParams.getRequired() == 1) {
                return false;
            }
        }
        return params != null && i == params.size();
    }

    private final boolean checkParamValid(EventParams it, Map.Entry<String, ? extends Object> entry) {
        if (it.getRequired() == 1) {
            return Intrinsics.areEqual(it.getParamsName(), entry.getKey()) && paramTypeCorrect(it.getParamsType(), entry.getValue());
        }
        return true;
    }

    private final boolean checkParam(EventConfig eventConfig, Bundle params) {
        Set<String> keySet;
        Object obj;
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV)) {
            return true;
        }
        if (params != null && (keySet = params.keySet()) != null) {
            for (String str : keySet) {
                Iterator<T> it = eventConfig.getEventParams().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    EventParams eventParams = (EventParams) obj;
                    if (Intrinsics.areEqual(eventParams.getParamsName(), str) && INSTANCE.paramTypeCorrect(eventParams.getParamsType(), params.get(str))) {
                        break;
                    }
                }
                if (((EventParams) obj) == null) {
                    return false;
                }
            }
        }
        int i = 0;
        for (EventParams eventParams2 : eventConfig.getEventParams()) {
            if ((params != null ? params.get(eventParams2.getParamsName()) : null) != null) {
                i++;
            } else if (eventParams2.getRequired() == 1) {
                return false;
            }
        }
        return i == (params != null ? params.size() : 0);
    }

    public final boolean checkParamValue(Bundle params) {
        Set<String> keySet;
        if (params != null && (keySet = params.keySet()) != null) {
            for (String str : keySet) {
                if (params.get(str) instanceof String) {
                    if (String.valueOf(params.get(str)).length() > 255 && (!Intrinsics.areEqual("content", str))) {
                        InitAnalysis.INSTANCE.quitEdit("param value err", "param is string, but length more than 255   key = " + str);
                        return false;
                    }
                    if (String.valueOf(params.get(str)).length() > 4096) {
                        InitAnalysis.INSTANCE.quitEdit("param value err", "param is string, but length more than 4096   key = " + str);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String diffParamsInfo(String eventName, Bundle params) {
        Set<String> keySet;
        Object obj;
        Class<?> cls;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        EventConfig checkName = checkName(eventName);
        if (checkName == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (params != null && (keySet = params.keySet()) != null) {
            for (String str : keySet) {
                Iterator<T> it = checkName.getEventParams().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((EventParams) obj).getParamsName(), str)) {
                        break;
                    }
                }
                EventParams eventParams = (EventParams) obj;
                if (eventParams == null) {
                    arrayList.add("Param \"" + str + "\" cannot be found in event configurations, please add this param on server correctly");
                } else if (params.get(str) == null) {
                    arrayList.add("Param \"" + str + "\"'s value in the bundle is null, which is forbidden");
                } else if (!INSTANCE.paramTypeCorrect(eventParams.getParamsType(), params.get(str))) {
                    Object obj2 = params.get(str);
                    arrayList.add("Param \"" + str + "\"'s data type cannot be matched with with configuration: {config: " + eventParams.getParamsType().name() + ", provided: " + ((obj2 == null || (cls = obj2.getClass()) == null) ? null : cls.getSimpleName()));
                }
            }
        }
        for (EventParams eventParams2 : checkName.getEventParams()) {
            if ((params != null ? params.get(eventParams2.getParamsName()) : null) == null && eventParams2.getRequired() == 1) {
                arrayList.add("Param \"" + eventParams2.getParamsName() + "\" is required, but not provided in the bundle.");
            }
        }
        return CollectionsKt.joinToString$default(arrayList, ", \n", null, null, 0, null, null, 62, null);
    }

    public final EventConfig checkName(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<EventConfig> eventsConfig = AnalysisUtils.INSTANCE.getEventsConfig();
        Object obj = null;
        if (eventsConfig == null) {
            return null;
        }
        Iterator<T> it = eventsConfig.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((EventConfig) next).getEventName(), eventName)) {
                obj = next;
                break;
            }
        }
        return (EventConfig) obj;
    }

    public final boolean isInBackListEvents(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<String> backListEvents = AnalysisUtils.INSTANCE.getBackListEvents();
        return backListEvents != null && backListEvents.contains(eventName);
    }

    private final boolean paramTypeCorrect(ParamsType paramsType, Object value) {
        int i = WhenMappings.$EnumSwitchMapping$0[paramsType.ordinal()];
        if (i == 1) {
            return value instanceof String;
        }
        if (i == 2) {
            return value instanceof Integer;
        }
        if (i == 3) {
            return value instanceof Float;
        }
        if (i == 4) {
            return value instanceof Double;
        }
        throw new NoWhenBranchMatchedException();
    }
}
