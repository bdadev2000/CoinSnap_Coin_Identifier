package com.glority.component.generatedAPI.kotlinAPI.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageCode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "English", "Japanese", "French", "Arabic", "Spanish", "Russian", "Portuguese", "German", "Italian", "Chinese", "Dutch", "Korean", "Swedish", "Polish", "TraditionalChinese", "Malay", "Thai", "Slovenia", "Romanian", "Indonesian", "Galician", "Finnish", "Norwegian", "Danish", "Turkish", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public enum LanguageCode {
    English(0),
    Japanese(1),
    French(2),
    Arabic(3),
    Spanish(4),
    Russian(5),
    Portuguese(6),
    German(7),
    Italian(8),
    Chinese(9),
    Dutch(10),
    Korean(11),
    Swedish(13),
    Polish(20),
    TraditionalChinese(21),
    Malay(22),
    Thai(23),
    Slovenia(26),
    Romanian(32),
    Indonesian(33),
    Galician(34),
    Finnish(35),
    Norwegian(36),
    Danish(37),
    Turkish(38);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    LanguageCode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: LanguageCode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode$Companion;", "", "()V", "fromName", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LanguageCode fromValue(int value) {
            LanguageCode[] values = LanguageCode.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                LanguageCode languageCode = values[i];
                i++;
                if (languageCode.getValue() == value) {
                    return languageCode;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum LanguageCode");
        }

        public final LanguageCode fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LanguageCode[] values = LanguageCode.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                LanguageCode languageCode = values[i];
                i++;
                if (Intrinsics.areEqual(languageCode.name(), name)) {
                    return languageCode;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum LanguageCode");
        }

        public final List<Integer> getJsonArrayMap(List<? extends LanguageCode> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((LanguageCode) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
