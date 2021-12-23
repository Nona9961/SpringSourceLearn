package com.nona9961.springsourcecode.withSpringboot.entity;

/**
 * @author nona9961
 * @date 2021/12/14 10:32
 */
public class InnerClass {

    public class PublicMemberClass {
    }

    protected class ProtectedMemberClass {
    }

    class MemberClass {
    }

    private class PrivateMemberClass {
    }

    public static class PublicStaticClass {
    }

    protected static class ProtectedStaticClass {
    }

    static class StaticClass {
    }

    private static class PrivateStaticClass {
    }


    public static void main(String[] args) {
        Class<?>[] declaredClasses = InnerClass.class.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }
    }

}
