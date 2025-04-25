package com.glority.component.generatedAPI.kotlinAPI.enums;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Gender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MALE", "FEMALE", "UNKNOWN", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class Gender {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Gender MALE = new Gender("MALE", 0, 0);
    public static final Gender FEMALE = new Gender("FEMALE", 1, 1);
    public static final Gender UNKNOWN = new Gender("UNKNOWN", 2, 2);

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{MALE, FEMALE, UNKNOWN};
    }

    public static EnumEntries<Gender> getEntries() {
        return $ENTRIES;
    }

    private Gender(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Gender.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender$Companion;", "", "<init>", "()V", "fromValue", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "value", "", "fromName", "name", "", "getJsonArrayMap", "", "array", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Gender fromValue(int value) {
            for (Gender gender : Gender.values()) {
                if (gender.getValue() == value) {
                    return gender;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum Gender");
        }

        public final Gender fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (Gender gender : Gender.values()) {
                if (Intrinsics.areEqual(gender.name(), name)) {
                    return gender;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum Gender");
        }

        public final List<Integer> getJsonArrayMap(List<? extends Gender> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Gender) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }
}
