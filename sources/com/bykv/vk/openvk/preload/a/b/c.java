package com.bykv.vk.openvk.preload.a.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public final class c {
    private final Map<Type, com.bykv.vk.openvk.preload.a.h<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b.b f9845b = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public c(Map<Type, com.bykv.vk.openvk.preload.a.h<?>> map) {
        this.a = map;
    }

    private <T> i<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f9845b.a(declaredConstructor);
            }
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.8
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e2) {
                        throw new AssertionError(e2);
                    } catch (InstantiationException e10) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e11.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    public final <T> i<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        i<T> iVar;
        final Type type = aVar.f9889c;
        final Class<? super T> cls = aVar.f9888b;
        final com.bykv.vk.openvk.preload.a.h<?> hVar = this.a.get(type);
        if (hVar != null) {
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.1
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) hVar.a();
                }
            };
        }
        final com.bykv.vk.openvk.preload.a.h<?> hVar2 = this.a.get(cls);
        if (hVar2 != null) {
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.7
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) hVar2.a();
                }
            };
        }
        i<T> a = a(cls);
        if (a != null) {
            return a;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.9
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.10
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a() {
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new com.bykv.vk.openvk.preload.a.l("Invalid EnumSet type: " + type.toString());
                        }
                        throw new com.bykv.vk.openvk.preload.a.l("Invalid EnumSet type: " + type.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(cls)) {
                iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.11
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a() {
                        return new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(cls)) {
                iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.12
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a() {
                        return new ArrayDeque();
                    }
                };
            } else {
                iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.13
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final Object a() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(cls)) {
            iVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.14
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final Object a() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
            iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.2
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final Object a() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(cls)) {
            iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.3
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final Object a() {
                    return new TreeMap();
                }
            };
        } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.bykv.vk.openvk.preload.a.c.a.a(((ParameterizedType) type).getActualTypeArguments()[0]).f9888b)) {
            iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.4
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final Object a() {
                    return new LinkedHashMap();
                }
            };
        } else {
            iVar = new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.5
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final Object a() {
                    return new h();
                }
            };
        }
        return iVar != null ? iVar : new i() { // from class: com.bykv.vk.openvk.preload.a.b.c.6

            /* renamed from: d, reason: collision with root package name */
            private final l f9851d = l.a();

            @Override // com.bykv.vk.openvk.preload.a.b.i
            public final Object a() {
                try {
                    return this.f9851d.a(cls);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
                }
            }
        };
    }
}
