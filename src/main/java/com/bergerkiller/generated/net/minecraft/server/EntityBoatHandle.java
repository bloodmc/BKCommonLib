package com.bergerkiller.generated.net.minecraft.server;

import com.bergerkiller.mountiplex.reflection.declarations.Template;
import com.bergerkiller.bukkit.common.wrappers.DataWatcher.Key;

/**
 * Instance wrapper handle for type <b>net.minecraft.server.EntityBoat</b>.
 * To access members without creating a handle type, use the static {@link #T} member.
 * New handles can be created from raw instances using {@link #createHandle(Object)}.
 */
@Template.InstanceType("net.minecraft.server.EntityBoat")
public abstract class EntityBoatHandle extends EntityHandle {
    /** @See {@link EntityBoatClass} */
    public static final EntityBoatClass T = Template.Class.create(EntityBoatClass.class, com.bergerkiller.bukkit.common.Common.TEMPLATE_RESOLVER);
    /* ============================================================================== */

    public static EntityBoatHandle createHandle(Object handleInstance) {
        return T.createHandle(handleInstance);
    }

    /* ============================================================================== */


    public static final Key<com.bergerkiller.bukkit.common.wrappers.BoatWoodType> DATA_WOOD_TYPE = Key.Type.BOAT_WOOD_TYPE.createKey(T.DATA_WOOD_TYPE, -1);
    /**
     * Stores class members for <b>net.minecraft.server.EntityBoat</b>.
     * Methods, fields, and constructors can be used without using Handle Objects.
     */
    public static final class EntityBoatClass extends Template.Class<EntityBoatHandle> {
        @Template.Optional
        public final Template.StaticField.Converted<Key<Integer>> DATA_WOOD_TYPE = new Template.StaticField.Converted<Key<Integer>>();

    }

}

