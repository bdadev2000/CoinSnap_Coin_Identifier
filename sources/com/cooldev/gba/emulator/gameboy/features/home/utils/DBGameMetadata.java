package com.cooldev.gba.emulator.gameboy.features.home.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.db.entity.GameRom;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameMetadata;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem;
import com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import d0.h;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class DBGameMetadata {

    @NotNull
    private final h sortedSystemIds$delegate = f0.t(DBGameMetadata$sortedSystemIds$2.INSTANCE);

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final z0.h THUMB_REPLACE = new z0.h("[&*/:`<>?\\\\|]");

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private final String computeCoverUrl(GameSystem gameSystem, String str) {
        String libretroFullName = gameSystem.getLibretroFullName();
        if (gameSystem.getId() == SystemID.MAME2003PLUS) {
            libretroFullName = "MAME";
        }
        if (str == null) {
            return null;
        }
        z0.h hVar = THUMB_REPLACE;
        hVar.getClass();
        String replaceAll = hVar.f31477a.matcher(str).replaceAll("_");
        a.r(replaceAll, "replaceAll(...)");
        return androidx.compose.foundation.text.input.a.m("http://thumbnails.libretro.com/", libretroFullName, "/Named_Boxarts/", replaceAll, ".png");
    }

    private final GameMetadata convertToGameMetadata(GameRom gameRom) {
        GameSystem.Companion companion = GameSystem.Companion;
        String system = gameRom.getSystem();
        a.p(system);
        GameSystem findById = companion.findById(system);
        return new GameMetadata(gameRom.getName(), gameRom.getSystem(), gameRom.getRomName(), gameRom.getDeveloper(), computeCoverUrl(findById, gameRom.getName()));
    }

    private final GameSystem extractGameSystem(GameRom gameRom) {
        GameSystem.Companion companion = GameSystem.Companion;
        String system = gameRom.getSystem();
        a.p(system);
        return companion.findById(system);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object findByCRC(com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r6, com.cooldev.gba.emulator.gameboy.db.GameDatabase r7, h0.g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByCRC$1
            if (r0 == 0) goto L13
            r0 = r8
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByCRC$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByCRC$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByCRC$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByCRC$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata r6 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata) r6
            kotlin.jvm.internal.q.m(r8)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.q.m(r8)
            java.lang.String r8 = r6.getCrc()
            if (r8 == 0) goto L66
            java.lang.String r8 = r6.getCrc()
            java.lang.String r2 = "0"
            boolean r8 = p0.a.g(r8, r2)
            if (r8 == 0) goto L4a
            goto L66
        L4a:
            java.lang.String r6 = r6.getCrc()
            com.cooldev.gba.emulator.gameboy.db.dao.GameDao r7 = r7.gameDao()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r7.findByCRC(r6, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r6 = r5
        L5e:
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r8 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r8
            if (r8 == 0) goto L66
            com.cooldev.gba.emulator.gameboy.features.home.models.GameMetadata r3 = r6.convertToGameMetadata(r8)
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata.findByCRC(com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile, com.cooldev.gba.emulator.gameboy.db.GameDatabase, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r0 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object findByFilename(com.cooldev.gba.emulator.gameboy.db.GameDatabase r5, com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r6, h0.g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByFilename$1
            if (r0 == 0) goto L13
            r0 = r7
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByFilename$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByFilename$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByFilename$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByFilename$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata r5 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata) r5
            kotlin.jvm.internal.q.m(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r7)
            com.cooldev.gba.emulator.gameboy.db.dao.GameDao r5 = r5.gameDao()
            java.lang.String r6 = r6.getName()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r5.findByFileName(r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            r6 = 0
            if (r7 == 0) goto L5f
            r0 = r7
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r0 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r0
            com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem r0 = r5.extractGameSystem(r0)
            com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem$Companion$ScanOptions r0 = r0.getScanOptions()
            boolean r0 = r0.getScanByFilename()
            if (r0 == 0) goto L5f
            goto L60
        L5f:
            r7 = r6
        L60:
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r7 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r7
            if (r7 == 0) goto L68
            com.cooldev.gba.emulator.gameboy.features.home.models.GameMetadata r6 = r5.convertToGameMetadata(r7)
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata.findByFilename(com.cooldev.gba.emulator.gameboy.db.GameDatabase, com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile, h0.g):java.lang.Object");
    }

    private final GameMetadata findByKnownSystem(StorageFile storageFile) {
        if (storageFile.getSystemID() == null) {
            return null;
        }
        return new GameMetadata(storageFile.getExtensionLessName(), storageFile.getSystemID().getDbname(), storageFile.getName(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r6 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object findByPathAndFilename(com.cooldev.gba.emulator.gameboy.db.GameDatabase r5, com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r6, h0.g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByPathAndFilename$1
            if (r0 == 0) goto L13
            r0 = r7
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByPathAndFilename$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByPathAndFilename$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByPathAndFilename$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findByPathAndFilename$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r6 = (com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile) r6
            java.lang.Object r5 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata r5 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata) r5
            kotlin.jvm.internal.q.m(r7)
            goto L51
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.jvm.internal.q.m(r7)
            com.cooldev.gba.emulator.gameboy.db.dao.GameDao r5 = r5.gameDao()
            java.lang.String r7 = r6.getName()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r5.findByFileName(r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r5 = r4
        L51:
            r0 = 0
            if (r7 == 0) goto L66
            r1 = r7
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r1 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r1
            com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem r1 = r5.extractGameSystem(r1)
            com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem$Companion$ScanOptions r1 = r1.getScanOptions()
            boolean r1 = r1.getScanByPathAndFilename()
            if (r1 == 0) goto L66
            goto L67
        L66:
            r7 = r0
        L67:
            if (r7 == 0) goto L83
            r1 = r7
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r1 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r1
            java.lang.String r6 = r6.getPath()
            com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem r1 = r5.extractGameSystem(r1)
            com.cooldev.gba.emulator.gameboy.features.home.models.SystemID r1 = r1.getId()
            java.lang.String r1 = r1.getDbname()
            boolean r6 = r5.parentContainsSystem(r6, r1)
            if (r6 == 0) goto L83
            goto L84
        L83:
            r7 = r0
        L84:
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r7 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r7
            if (r7 == 0) goto L8c
            com.cooldev.gba.emulator.gameboy.features.home.models.GameMetadata r0 = r5.convertToGameMetadata(r7)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata.findByPathAndFilename(com.cooldev.gba.emulator.gameboy.db.GameDatabase, com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile, h0.g):java.lang.Object");
    }

    private final GameMetadata findByPathAndSupportedExtension(StorageFile storageFile) {
        Object obj;
        List<String> sortedSystemIds = getSortedSystemIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : sortedSystemIds) {
            if (parentContainsSystem(storageFile.getPath(), (String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(GameSystem.Companion.findById((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((GameSystem) obj3).getScanOptions().getScanByPathAndSupportedExtensions()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((GameSystem) obj).getSupportedExtensions().contains(storageFile.getExtension())) {
                break;
            }
        }
        GameSystem gameSystem = (GameSystem) obj;
        if (gameSystem == null) {
            return null;
        }
        return new GameMetadata(storageFile.getExtensionLessName(), gameSystem.getId().getDbname(), storageFile.getName(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object findBySerial(com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r6, com.cooldev.gba.emulator.gameboy.db.GameDatabase r7, h0.g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findBySerial$1
            if (r0 == 0) goto L13
            r0 = r8
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findBySerial$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findBySerial$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findBySerial$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata$findBySerial$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata r6 = (com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata) r6
            kotlin.jvm.internal.q.m(r8)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.q.m(r8)
            java.lang.String r8 = r6.getSerial()
            if (r8 != 0) goto L3e
            return r3
        L3e:
            com.cooldev.gba.emulator.gameboy.db.dao.GameDao r7 = r7.gameDao()
            java.lang.String r6 = r6.getSerial()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r7.findBySerial(r6, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r6 = r5
        L52:
            com.cooldev.gba.emulator.gameboy.db.entity.GameRom r8 = (com.cooldev.gba.emulator.gameboy.db.entity.GameRom) r8
            if (r8 == 0) goto L5a
            com.cooldev.gba.emulator.gameboy.features.home.models.GameMetadata r3 = r6.convertToGameMetadata(r8)
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata.findBySerial(com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile, com.cooldev.gba.emulator.gameboy.db.GameDatabase, h0.g):java.lang.Object");
    }

    private final GameMetadata findByUniqueExtension(StorageFile storageFile) {
        GameSystem.Companion.ScanOptions scanOptions;
        GameSystem findByUniqueFileExtension = GameSystem.Companion.findByUniqueFileExtension(storageFile.getExtension());
        if ((findByUniqueFileExtension == null || (scanOptions = findByUniqueFileExtension.getScanOptions()) == null || scanOptions.getScanByUniqueExtension()) && findByUniqueFileExtension != null) {
            return new GameMetadata(storageFile.getExtensionLessName(), findByUniqueFileExtension.getId().getDbname(), storageFile.getName(), null, null);
        }
        return null;
    }

    private final List<String> getSortedSystemIds() {
        return (List) this.sortedSystemIds$delegate.getValue();
    }

    private final boolean parentContainsSystem(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.getDefault();
        a.r(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        a.r(lowerCase, "toLowerCase(...)");
        return m.M0(lowerCase, str2, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(8:13|14|15|(1:21)|23|(1:25)|26|27)(2:29|30))(8:31|32|33|(2:35|(1:37)(3:38|15|(3:17|19|21)))|23|(0)|26|27))(8:39|40|41|(2:43|(1:45)(3:46|33|(0)))|23|(0)|26|27))(2:47|48))(3:55|56|(1:58)(1:59))|49|(2:51|(1:53)(3:54|41|(0)))|23|(0)|26|27))|62|6|7|(0)(0)|49|(0)|23|(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        r10 = kotlin.jvm.internal.q.d(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:15:0x00cd, B:17:0x00d1, B:19:0x00d7, B:21:0x00dd, B:32:0x0051, B:33:0x00b9, B:35:0x00bd, B:40:0x0061, B:41:0x00a5, B:43:0x00a9, B:48:0x0071, B:49:0x0091, B:51:0x0095, B:56:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:15:0x00cd, B:17:0x00d1, B:19:0x00d7, B:21:0x00dd, B:32:0x0051, B:33:0x00b9, B:35:0x00bd, B:40:0x0061, B:41:0x00a5, B:43:0x00a9, B:48:0x0071, B:49:0x0091, B:51:0x0095, B:56:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:15:0x00cd, B:17:0x00d1, B:19:0x00d7, B:21:0x00dd, B:32:0x0051, B:33:0x00b9, B:35:0x00bd, B:40:0x0061, B:41:0x00a5, B:43:0x00a9, B:48:0x0071, B:49:0x0091, B:51:0x0095, B:56:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object retrieveMetadata(@org.jetbrains.annotations.NotNull com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r9, @org.jetbrains.annotations.NotNull h0.g r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata.retrieveMetadata(com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile, h0.g):java.lang.Object");
    }
}
