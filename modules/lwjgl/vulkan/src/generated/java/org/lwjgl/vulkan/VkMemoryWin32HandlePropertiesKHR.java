/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Properties of External Memory Windows Handles.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code memoryTypeBits} &ndash; a bitmask containing one bit set for every memory type which the specified windows handle <b>can</b> be imported as.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryWin32HandlePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t memoryTypeBits;
 * }</pre></code>
 */
public class VkMemoryWin32HandlePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYTYPEBITS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    VkMemoryWin32HandlePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryWin32HandlePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryWin32HandlePropertiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryWin32HandlePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryWin32HandlePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryWin32HandlePropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryWin32HandlePropertiesKHR set(VkMemoryWin32HandlePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryWin32HandlePropertiesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryWin32HandlePropertiesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryWin32HandlePropertiesKHR create() {
        return new VkMemoryWin32HandlePropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance for the specified memory address. */
    public static VkMemoryWin32HandlePropertiesKHR create(long address) {
        return new VkMemoryWin32HandlePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryWin32HandlePropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryWin32HandlePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryWin32HandlePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryWin32HandlePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryWin32HandlePropertiesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryWin32HandlePropertiesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryWin32HandlePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryWin32HandlePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryWin32HandlePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryWin32HandlePropertiesKHR.MEMORYTYPEBITS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryWin32HandlePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryWin32HandlePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryWin32HandlePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryWin32HandlePropertiesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryWin32HandlePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryWin32HandlePropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkMemoryWin32HandlePropertiesKHR newInstance(long address) {
            return new VkMemoryWin32HandlePropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryWin32HandlePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryWin32HandlePropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkMemoryWin32HandlePropertiesKHR.nmemoryTypeBits(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryWin32HandlePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryWin32HandlePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryWin32HandlePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkMemoryWin32HandlePropertiesKHR.npNext(address(), value); return this; }

    }

}