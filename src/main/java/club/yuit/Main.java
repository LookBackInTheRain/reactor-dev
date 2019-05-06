package club.yuit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author yuit
 * @date 2019/5/6 9:46
 **/
public class Main {

    public static void main(String[] args) {

        /*Mono.just("123")
                .flatMap(
                        (item)-> Mono.just(item+"qwe")
                )
                .subscribe(
                (t)->{
                    System.out.println("handle:"+t);
                    },
                (err)->{
                    err.printStackTrace();
                    System.out.println("on err");
                },
                ()->{
                    System.out.println("on complete");
                }
        );*/

        /*Flux.just("123q", "qwe", "yuit", "iiioo")
                *//*.filter(item -> item.contains("q"))*//*
                .switchIfEmpty(item -> {

                }).doOnNext(
                item -> {
                    System.out.println(item);
                    next();
                }
        )
                .subscribe(
                        (i) -> System.out.println(i)
                );*/

        System.out.println("bearer asdahjsfhsjdfhasdjkf".substring(0,6));




    }


    public static void next() {
        System.out.println("----->bext");
    }

}


